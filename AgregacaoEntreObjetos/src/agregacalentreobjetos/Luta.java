package agregacalentreobjetos;

import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado; // Tipo Abstrato de Dado
    private Lutador desafiante; // Tipo Abstrato de Dado
    private int rounds;
    private boolean aprovada;

    // Metodos Personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && !l1.equals(l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println("#### RESULTADO DA LUTA ####");
            switch (vencedor) {
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                    System.out.println("Desafiado " + this.desafiado.getNome() + " agora, com " + this.desafiado.getEmpates() + " empates");
                    System.out.println("Desafiante " + this.desafiante.getNome() + " agora, com " + this.desafiante.getEmpates() + " empates");
                    break;
                case 1: // ganhou desafiado
                    this.desafiado.ganharLuta();
                    System.out.println("Desafiado " + this.desafiado.getNome() + " venceu");
                    System.out.println("Agora, com " + this.desafiado.getVitorias() + " vitorias");

                    this.desafiante.perderLuta();
                    System.out.println("Desafiante " + this.desafiante.getNome() + " perdeu");
                    System.out.println("Agora, com " + this.desafiante.getDerrotas() + " derrotas");
                    break;
                case 2: // ganhou desafiante
                    this.desafiante.ganharLuta();
                    System.out.println("Desafiante " + this.desafiante.getNome() + " venceu");
                    System.out.println("Agora, com " + this.desafiante.getVitorias() + " vitorias");

                    this.desafiado.perderLuta();
                    System.out.println("Desafiado " + this.desafiado.getNome() + " perdeu");
                    System.out.println("Agora, com " + this.desafiado.getDerrotas()+ " derrotas");
                    break;
                default:
                    System.out.println("Valor aleatorio invalido");
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Getters e Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
