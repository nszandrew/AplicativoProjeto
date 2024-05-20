
package br.com.login.controller;

import br.com.login.controller.regex.Regex;
import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.login.hashcode.HashCode;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import br.com.login.view.MenuView;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

import br.com.login.model.InformacoesLogin;

public class LoginController {
    
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
      Connection conexao = new Conexao().getConnection();
      LoginDAO cadastro = new LoginDAO();
      HashCode hs = new HashCode();
      String pass = hs.hashPassword(view.getjPasswordFieldSenha().getText());
      Regex rx = new Regex();
        if (rx.validarEmail(view.getjTextFieldEmail().getText()) & rx.validarTelefone(view.getjTextFieldTelefone().getText())){
            cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), pass, view.getjTextFieldTelefone().getText());
            LoginView telaLogin = new LoginView();
            telaLogin.setVisible(true);
            MenuView menuView = new MenuView();
            menuView.setVisible(false);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        }else {
            JOptionPane.showMessageDialog(null, "Credencias invalidas \nDigite o email seuemail@dominio.com \nDigite seu telefone com no minimo 11 digitos");
            
        }
    
    }
    
    public boolean loginUsuario(LoginView view) throws SQLException{
      Connection conexao = new Conexao().getConnection();
      LoginDAO login = new LoginDAO();
      String senhaDigitada = view.getjPasswordFieldSenha().getText();
      HashCode hs = new HashCode();
      String senha = hs.hashPassword(senhaDigitada);     
      return login.login(view.getjTextFieldEmail().getText(), senha);
     
    }
    
    
    public InformacoesLogin buscarInformacoes(String emailRequerido) throws SQLException{
        String sql = "SELECT email, nome, senha, telefone FROM login WHERE email = ?";
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.setString(1, emailRequerido);
        try(ResultSet rs = statment.executeQuery()){
             if (rs.next()){
                  String email = rs.getString("email");
                  String nome = rs.getString("nome");
                  String senha = "";
                  String telefone = rs.getString("telefone");                              
                  return InformacoesLogin.getInstance(email, nome, senha, telefone);                
                  
             }     
        rs.close();
        statment.close();
        conexao.close();
      }catch (SQLException e){
          throw new RuntimeException(e);
      }
        return null;
    }
    
    public void alterarInformacoes(String email, String nome, String senha, String telefone, String emailTroca) throws SQLException{
        String sql = "UPDATE login SET email = ?, nome = ?, senha = ?, telefone = ? WHERE email = ?";      
        Connection conexao = null;
        PreparedStatement statment = null;
        try {
            conexao = new Conexao().getConnection();
            statment = conexao.prepareStatement(sql);
            statment.setString(1, email);
            statment.setString(2,nome);
            statment.setString(3,senha);
            statment.setString(4,telefone);
            statment.setString(5,emailTroca);
           
            int rowsUpdated = statment.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Registro Atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro foi atualizado.");
        }
        
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
        if (statment != null) {
            try {
                statment.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }  
        }
        } 
    }
}
