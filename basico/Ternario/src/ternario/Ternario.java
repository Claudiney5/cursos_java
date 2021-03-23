/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternario;

import java.util.Scanner;

/**
 *
 * @author claudiney
 */
public class Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyword = new Scanner(System.in);
        
        System.out.println("Teste sua sorte. Digite o valor da habilidade: ");
        int nh = keyword.nextInt();
        System.out.println("Lançando os dados...");
        long d1 = Math.round(Math.random()*5+1);
        System.out.println("D1: " + d1);
        long d2 = (Math.round(Math.random()*5+1));
        System.out.println("D2: " + d2);
        long d3 = (Math.round(Math.random()*5+1));
        System.out.println("D3: " + d3);
        String Resultado = (d1 + d2 + d3) > nh ? "Falhou" : "Sucesso!";
        System.out.println(Resultado + " " + (nh - d1 - d2 -d3));
    }
    
}
