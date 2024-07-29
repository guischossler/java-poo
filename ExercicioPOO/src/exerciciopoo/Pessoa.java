package exerciciopoo;

public class Pessoa {

    // Atributos
    private String nome, sexo;
    private int idade;

    // Metodos
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println(this.getNome() + " está fazendo " + this.getIdade() + " anos");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
