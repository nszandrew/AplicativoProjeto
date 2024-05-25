package br.com.login.dao;


import br.com.login.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha, String telefone) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO tb_usuario (nome, email, senha, telefone) VALUES (?, ?, ?, ?)";
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.setString(1, nome);
        statment.setString(2, email);
        statment.setString(3, senha);
        statment.setString(4, telefone);
        statment.execute();
        conexao.close();
        statment.close();
    }         
    
    public boolean login(String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email,senha FROM tb_usuario WHERE email = ? AND senha = ?";
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.setString(1, email);
        statment.setString(2, senha);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()){          
            conexao.close();
            statment.close();
            rs.close();
            return true;
            
        } else {        
            conexao.close();
            statment.close();
            rs.close();
            return false;
            
        }
    }    
}
