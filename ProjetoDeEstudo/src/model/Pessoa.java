package model;

public class Pessoa {

    private String nome, telefone, email, dtNascimento;
    private int id;
    private char sexo;
    private boolean ativo;

    public Pessoa() {

    }

    public Pessoa(String nome, char sexo, String telefone, String email, String dtNascimento, boolean ativo) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "\nId: " + id
                + "\nNome: " + nome
                + "\nSexo: " + sexo
                + "\nTelefone: " + telefone
                + "\nE-Mail: " + email
                + "\nData Nasc.: " + dtNascimento
                + "\nAtivo: " + ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
