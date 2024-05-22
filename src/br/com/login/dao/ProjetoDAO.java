
package br.com.login.dao;
import br.com.login.model.InfoProjeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
/**
*
* @author Nicolas
*/
public class ProjetoDAO {
    
//    public InfoProjeto[] obterProjetos() throws SQLException {
//        String sql = "select * from tb_projeto;";
//        try (Connection conexao = new Conexao().getConnection(); 
//                PreparedStatement ps = conexao.prepareStatement(sql,
//                        ResultSet.TYPE_SCROLL_INSENSITIVE,
//                        ResultSet.CONCUR_READ_ONLY);
//                ResultSet rs = ps.executeQuery();) {
//                    int totalDeProjetos = rs.last() ? rs.getRow(): 0;
//                    InfoProjeto[] projetos = new InfoProjeto[totalDeProjetos];
//                    rs.beforeFirst();
//                    int contador = 0;
//                    while (rs.next()) {
//                        int id = rs.getInt("id_projeto");
//                        String nome = rs.getString("ods_projeto");
//                        
//                        projetos[contador++] = new InfoProjeto(id, nome);
//                    }
//                    return projetos;
//                }
//
//    }
    public void inserirProjeto (String ods, String descricao) throws SQLException {   
        String sql = "insert into tb_projeto (ods_projeto, descricao_projeto) values (?, ?);";
        try (Connection conexao = new Conexao().getConnection();
                PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setString(1, ods);
            ps.setString(2, descricao);
            ps.executeQuery();
        }
    }
}
