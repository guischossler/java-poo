package polimorfismoparte1;

public class Main {

    public static void main(String[] args) {
        // Polimorfismo - Sobreposição

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        /*
        a.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("--------");
        a.locomover();

        System.out.println("--------");
        r.locomover();

        System.out.println("--------");
        p.locomover();
        */
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();        
    }

}
