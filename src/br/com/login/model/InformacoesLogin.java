
package br.com.login.model;

public class InformacoesLogin {
    private static InformacoesLogin instance;
    private String email, nome, senha, telefone, emailPesquisa;

    private InformacoesLogin(String email, String nome, String senha, String telefone) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }
    public InformacoesLogin (){

    }
            
    public static InformacoesLogin getInstance(String email, String nome, String senha, String telefone) {
        if (instance == null) {
            instance = new InformacoesLogin(email, nome, senha, telefone);
        }
        return instance;
    }
    
    
    public String getEmailPesquisa() {
        return emailPesquisa;
    }

    public void setEmailPesquisa(String email) {
        this.email = emailPesquisa;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
