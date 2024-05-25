
package br.com.login.model;


public class Login {
    private String nome, email, senha, userEmail;
    private String telefone;

    public Login(String email, String senha, String telefone) {
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public Login(){
    
   }
    
    public void cadastrar(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
        public  String getUserEmail() {
            return userEmail;
    }

        public void setUserEmail(String email) {
            userEmail = email;
    }
    
}
