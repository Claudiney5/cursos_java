
package aula13polimorfismosobrecarga;


public class Aula13PolimorfismoSobrecarga {

   
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Toma comida");
        c.reagir("Vai apanhar!");
        c.reagir(11, 45);
        c.reagir(14, 20);
        c.reagir(19, 12);
        c.reagir(true);
        c.reagir(false);
        c.reagir(8, 5.2f);
        c.reagir(4, 6.2f);
        c.reagir(8, 11.8f);
        c.reagir(4,12.5f);
                
    }
    
}
