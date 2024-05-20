/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.model;

/**
 *
 * @author Nicolas
 */
public class InfoProjeto {
    private String nome, data_criacao, status, descricao;
    private int id;
    
    public InfoProjeto (String nome, String data_criacao, String status, int id, String descricao) {
        
        this.nome = nome;
        this.data_criacao = data_criacao;
        this.status = status;
        this.id = id;
        this.descricao = descricao;
    }
    
    public InfoProjeto(String nome, String data_criacao, String status, String descricao) {
        this.nome = nome;
        this.data_criacao = data_criacao;
        this.status = status;
        this.descricao = descricao;
    }
    
    public InfoProjeto (int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int codigo) {
        this.id = id;
    }
    
    
}
