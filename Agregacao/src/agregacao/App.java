package agregacao;

import telefone.Contatos;
import telefone.Telefone;
import telefone.Contato;

public class App {

    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002 8922");
        Contato contatoA = new Contato("Guilherme", "9999");
        Contato contatoB = new Contato("Lucas", "6666");
        Contato contatoC = new Contato("Maria", "77777");
        Contato contatoD = new Contato("Gerson", "88888");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        System.out.println(telefoneContatos);

        System.out.println("");
        System.out.println(telefoneContatos.buscar("g"));
        
        telefone.ligar(contatoA.getNumero());
        telefone.ligar(contatoB);
        System.out.println("");
        System.out.println(telefone.getChamadas());
    }

}
