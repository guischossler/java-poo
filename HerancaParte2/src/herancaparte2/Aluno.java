package herancaparte2;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        //posso fazer this.nome porque Pessoa está com o atributo nome como Protected
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
