/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor1;

import java.util.Arrays;

/**
 *
 * @author claudiney
 */
public class Vetor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = {3, 4, 5, 2, 9, 10, 7, 4};
        Arrays.fill(n, 0);
        System.out.println(n);
        for (int i = 0; i < n.length; i++ ) {
            System.out.println("Na posição " + i + ": " + n[i]);
        }
    }
    
}
