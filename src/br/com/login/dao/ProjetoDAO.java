/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public InfoProjeto[] obterProjetos() throws SQLException {
        String sql = "select * from tb_projeto;";
        try (Connection conexao = new Conexao().getConnection(); 
                PreparedStatement ps = conexao.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery();) {
                    int totalDeProjetos = rs.last() ? rs.getRow(): 0;
                    InfoProjeto[] projetos = new InfoProjeto[totalDeProjetos];
                    rs.beforeFirst();
                    int contador = 0;
                    while (rs.next()) {
                        int id = rs.getInt("id_projeto");
                        String nome = rs.getString("nome_projeto");
                        projetos[contador++] = new InfoProjeto(id, nome);
                    
                    }
                    return projetos;
                }
   
            
    }
    public void criar (InfoProjeto infoProjeto) throws SQLException {   
        String sql = "insert into tb_projeto (nome_projeto) values (?);";
        try (Connection conexao = new Conexao().getConnection();
                PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setString(1, infoProjeto.getNome());
            ps.executeQuery();
            
        }
    }
    
}
