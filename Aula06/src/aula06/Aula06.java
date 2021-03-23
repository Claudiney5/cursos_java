package aula06;

public class Aula06 {


    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.status();
        c.ligar();
        
        c.maisVolume();
        c.status();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.status();
        c.desligar();
        c.status();
    }
    
}
