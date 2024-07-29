package agregacalentreobjetos;

public class Main {

    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Vitor Belfive", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Josnei Silva", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Maike Traice", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Mega Zorde", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Juca Bala", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Seline Dion", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    
        // mostrar dados de cada lutador
        for (int i = 0; i < l.length; i++) {
            System.out.println("Lutador [" + i + "]:");
            l[i].status();
            System.out.println("");
        }
        
        // LUTA
        System.out.println("--------------");
        Luta luta = new Luta();
        luta.marcarLuta(l[0], l[1]);
        //luta.marcarLuta(l[1], l[5]); // a luta não pode acontecer
        luta.lutar();
    }

}
