package application;

import db.ConexaoBD;
import dao.PessoaDAO;
import java.util.ArrayList;
import model.Pessoa;

public class ProjetoDeEstudo {

    public static void main(String[] args) {
        
        
        PessoaDAO pdao = new PessoaDAO();
        //Pessoa p1 = new Pessoa("Joaquim", "M", 21);
        //Pessoa p2 = new Pessoa("Fernanda", "F", 78);
        //Pessoa p3 = new Pessoa("Perseu", "M", 17);
        
        Pessoa p1 = new Pessoa("ABC", 'M', "51999999999", "email1@teste.com", "01012001", true);
        Pessoa p2 = new Pessoa("DEF", 'F', "51888889999", "email2@teste.com", "02022002", true);
        Pessoa p3 = new Pessoa("GHI", 'M', "51777779999", "email3@teste.com", "03032003", true);
        
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
