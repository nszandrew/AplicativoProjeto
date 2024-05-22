
package br.com.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 

public class ProjetoDAO {
    

    public void inserirProjeto (String ods, String email, String descricao, boolean status) throws SQLException {   
        String sql = "INSERT INTO tb_projeto (ods_projeto, id_usuario, descricao, status_projeto) VALUES (?, ?, ?, ?);";
        try (Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setString(1, ods);
            ps.setString(2, email);
            ps.setString(3, descricao);
            ps.setBoolean(4, status);
            ps.executeUpdate();
            
            conexao.close();
            ps.close();
        }
    }
}
