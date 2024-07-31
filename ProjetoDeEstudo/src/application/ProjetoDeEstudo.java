package application;

import db.ConexaoBD;
import dao.PessoaDAO;
import model.Pessoa;

public class ProjetoDeEstudo {

    public static void main(String[] args) {
     
        PessoaDAO pdao = new PessoaDAO();
        Pessoa p = new Pessoa("Jose", "M", 22);
        //System.out.println(pdao.inserir(p));
        pdao.deletar(3);
        //System.out.println(pdao.consultar(4));
        
    }

}
