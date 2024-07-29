package exerciciopoo;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{\n\tTitulo: " + this.getTitulo()
                + "\n\tAutor: " + this.getAutor()
                + "\n\tTot. Pag: " + this.getTotPaginas()
                + "\n\tPag. Atual: " + this.getPagAtual()
                + "\n\tAberto? " + this.isAberto()
                + "\n\tLeitor Nome: " + this.getLeitor().getNome()
                + "\n\tLeitor Idade: " + this.getLeitor().getIdade()
                + "\n\tLeitor Sexo: " + this.getLeitor().getSexo()
                + "\n}";
    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro foi aberto");
        } else {
            System.out.println("Impossível abrir um livro já aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto) {
            this.setAberto(false);
            System.out.println("Livro foi fechado");
        } else {
            System.out.println("Impossível fechar um livro já fechado");
        }
    }

    @Override
    public void folhear(int p) {
        if (this.totPaginas >= p) {
            this.pagAtual = p;
        } else {
            System.out.println("Essa página não existe");
        }
    }

    @Override
    public void avancarPag() {
        if (this.getTotPaginas() >= this.getPagAtual()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avançar para " + this.getPagAtual());
        } else {
            System.out.println("Chegou ao fim do livro");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 1) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Avançar para " + this.getPagAtual());
        } else {
            System.out.println("Chegou ao fim do livro");
        }
    }

    // Getters e Setters
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

}
