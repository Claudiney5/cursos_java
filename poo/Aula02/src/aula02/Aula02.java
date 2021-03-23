package aula02;

public class Aula02 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        
        c2.cor = "vermelha";
        c2.ponta = 0.7f;
        c2.tampada = true;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        c2.status();
        c2.rabiscar();
        
    }
    
}
