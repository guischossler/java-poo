package classes;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodos Especiais
    public ContaBanco() { // Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }

    // Metodos Personalizados
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta()
                + "\nTipo: " + this.getTipo()
                + "\nDono: " + this.getDono()
                + "\nSaldo: " + this.getSaldo()
                + "\nStatus: " + this.isStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso");
        switch (this.getTipo()) {
            case "CC":
                this.setSaldo(50);
                break;
            case "CP":
                this.setSaldo(150);
                break;
            default:
                System.out.println("Tipo de conta não existe");
                break;
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso em nome de " + this.getDono().toUpperCase());
        } else {
            System.out.println("Não é possível despositar pois a conta está fechada");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                System.out.println("Saque realizado com sucesso em nome de " + this.getDono().toUpperCase());
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente para realizar um saque");
            }
        } else {
            System.out.println("A conta precisa estar ativa para realizar um saque");
        }
    }

    public void pagarMensal() {
        if (this.isStatus()) {
            switch (this.getTipo()) {
                case "CC":
                    this.setSaldo(this.getSaldo() - 12);
                    System.out.println("Mensalidade paga com sucesso por " + this.getDono().toUpperCase());
                    break;
                case "CP":
                    this.setSaldo(this.getSaldo() - 20);
                    System.out.println("Mensalidade paga com sucesso por " + this.getDono().toUpperCase());
                    break;
                default:
                    System.out.println("Tipo de conta inválido");
                    break;
            }
        } else {
            System.out.println("A contá está fechada");
        }
    }

    // getters e setters
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}