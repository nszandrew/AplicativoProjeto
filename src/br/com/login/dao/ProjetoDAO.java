
package br.com.login.dao;
import br.com.login.model.InfoProjeto;
import br.com.login.model.InformacoesLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

public class ProjetoDAO {
    

    public void inserirProjeto (String ods, String email, String descricao, boolean status) throws SQLException {   
        String sql = "INSERT INTO tb_projeto (ods, id_usuario, descricao, status_projeto) VALUES (?, ?, ?, ?);";
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
    
    public InfoProjeto[] obterODS() throws SQLException {
        String sql = "select * from tb_curso;";
        try(Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql,                         
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                        ResultSet rs = ps.executeQuery();){
            int totalDeCursos = rs.last() ? rs.getRow(): 0;
            InfoProjeto[] info = new InfoProjeto[totalDeCursos];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                String ods = rs.getString("ods");
                String dataCriacao = rs.getString("data");
                boolean status = rs.getBoolean("tipo");
                String descricao = rs.getString("descricao");
                info[contador++] = new InfoProjeto(ods, dataCriacao, status, descricao); 
            }
            conexao.close();
            ps.close();
            rs.close();
            return info;        
        }    
    } 
        public void alterarDados(String ods, String status, String descricao, String id){
        String sql = "UPDATE tb_projeto SET ods = ?, status_projeto = ?, descricao = ? WHERE id_projeto = ?";
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, ods);
            ps.setString(2, status);
            ps.setString(3, descricao);
            ps.setString(4, id);
            ps.executeUpdate();
            conexao.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deletarDados(String id){
        String sql = "DELETE FROM tb_projeto WHERE id_projeto = ?";
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
