/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13polimorfismosobrecarga;

/**
 *
 * @author claudiney
 */
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }
    
    public void reagir(String frase) {
        frase = frase.toLowerCase();
        if ((frase.equals("toma comida"))||(frase.equals("olá"))){
            System.out.println("Abanando o rabo");
        } else {
            System.out.println("Rosnando!!!");
        }        
    }
  
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanando o rabo com energia");
        } else if (hora >= 18) {
            System.out.println("Ignorando");
        } else {
            System.out.println("Abanando e latindo");
        }        
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanando e sacolejando");
        } else {
            System.out.println("rosnando e latindo ameaçadoramente!!");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("abanando com alegria");
            } else {
                System.out.println("latindo");
            }
        } else {
            if (peso < 10) {
                System.out.println("rosnando irritado");
            } else {
                System.out.println("ignorando cansado");
            }
        }
    }
    
}
