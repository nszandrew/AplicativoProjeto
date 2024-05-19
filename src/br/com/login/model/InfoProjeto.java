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
    private int codigo;
    
    public InfoProjeto (String nome, String data_criacao, String status, int codigo, String descricao) {
        
        this.nome = nome;
        this.data_criacao = data_criacao;
        this.status = status;
        this.codigo = codigo;
        this.descricao = descricao;
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

    public int getCodigo() {
        return codigo;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
