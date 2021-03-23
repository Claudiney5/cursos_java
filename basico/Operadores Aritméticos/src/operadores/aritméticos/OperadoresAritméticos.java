/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores.aritméticos;

/**
 *
 * @author claudiney
 */
public class OperadoresAritméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é: " + m);
        
        int numero = 2;
        numero++;
        ++m;
        System.out.println("INcrementado " + ++m);
        System.out.println(Math.PI);
        System.out.println(Math.pow(m, numero));
        System.out.println(Math.round(Math.random()*5)+1);
        
    }
    
}
