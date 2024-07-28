/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
    
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");


        p1.depositar(100);
        p2.depositar(500);

        // p2.sacar(100);
        p2.sacar(651);

        p1.sacar(150);
        p1.fecharConta();

        p2.pagarMensal();

        System.out.println("------------------------------");
        p1.estadoAtual();
        System.out.println("------------------------------");
        p2.estadoAtual();
    }
    
}
