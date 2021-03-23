
package aula12polimorfismo;


public class Aula12Polimorfismo {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru guru = new Canguru();
        Cachorro kuru = new Cachorro();
        
        
        m1.setPeso(878.4f);
        m1.setIdade(25);
        m1.setMembros(4);    
        m1.setCorPelo("marrom");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        
        r1.setPeso(878.4f);
        r1.setIdade(25);
        r1.setMembros(4);        
        r1.locomover();
        r1.alimentar();
        
        guru.locomover();
        kuru.locomover();
        
    }
    
}
