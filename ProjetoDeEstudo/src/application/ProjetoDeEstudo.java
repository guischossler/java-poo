package application;

import db.ConexaoBD;
import dao.PessoaDAO;
import java.util.ArrayList;
import model.Pessoa;

public class ProjetoDeEstudo {

    public static void main(String[] args) {

        PessoaDAO pdao = new PessoaDAO();
        Pessoa p1 = new Pessoa("Joaquim", "M", 21);
        Pessoa p2 = new Pessoa("Fernanda", "F", 78);
        Pessoa p3 = new Pessoa("Perseu", "M", 17);

        pdao.inserir(p1);
        pdao.inserir(p2);
        pdao.inserir(p3);
        //System.out.println(pdao.consultarTodos());
        ArrayList<Pessoa> pTodos = new ArrayList<>();
        pTodos = pdao.consultarTodos();
        pdao.MostrarEmLista(pTodos);

        //pdao.deletar(4);
        //pdao.deletar(5);
        //pdao.deletar(6);
        
    }

}
