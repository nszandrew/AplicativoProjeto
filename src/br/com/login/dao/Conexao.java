package br.com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/aplicacao?user=root&password=anima123";    
        Connection conexao = DriverManager.getConnection(url);
        return conexao;
    }
}
