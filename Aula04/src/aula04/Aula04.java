
package aula04;

public class Aula04 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NICness", 0.75f, true, "vermelha");

        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo());
        
    }
    
}
