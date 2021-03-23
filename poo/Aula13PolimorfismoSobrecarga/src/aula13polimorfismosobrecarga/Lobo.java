
package aula13polimorfismosobrecarga;

public class Lobo  extends Animal { 

    @Override
    public void locomover() {
        System.out.println("CAminhando silenciosamente.");
    }

    @Override
    public void alimentar() {
        System.out.println("Caçando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Uivando");
    }
    
    
    
}
