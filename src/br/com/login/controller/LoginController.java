
package br.com.login.controller;

import br.com.login.controller.regex.Regex;
import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.login.hashcode.HashCode;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import br.com.login.view.MenuView;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Credencias invalidas \nDigite o email seuemail@dominio.com \nDigite seu telefone xx-xxxxx-xxxx");
            
        }
      //cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), pass, view.getjTextFieldTelefone().getText());
    
    }
    
    public boolean loginUsuario(LoginView view) throws SQLException{
      Connection conexao = new Conexao().getConnection();
      LoginDAO login = new LoginDAO();
      String senhaDigitada = view.getjPasswordFieldSenha().getText();
      HashCode hs = new HashCode();
      String senha = hs.hashPassword(senhaDigitada);      
      return login.login(view.getjTextFieldEmail().getText(), senha);
     
    
    }
}
