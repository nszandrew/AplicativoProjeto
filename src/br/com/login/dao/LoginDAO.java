package br.com.login.dao;

import br.com.login.view.LoginView;
import br.com.login.view.MenuView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha, String telefone) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome, email, senha, telefone) VALUES ('"+nome+"','"+email+"','"+senha+"','"+telefone+"')";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();                
    }         
    
    public boolean login(String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email,senha FROM login WHERE email = '"+email+"' AND senha = '"+senha+"'";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()){
            System.out.println("Possui");            
            conexao.close(); 
            return true;
            
        } else {
            System.out.println("Nao possui");            
            conexao.close();
            return false;
            
        }
        
         
    }
}
