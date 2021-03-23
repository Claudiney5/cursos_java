package aula03;

public class Aula03 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        c1.carga = 80;
        c1.tampar();

        c1.status();
        c1.rabiscar();
        
        c1.destampar();
        c1.rabiscar();
        
    }
    
}
