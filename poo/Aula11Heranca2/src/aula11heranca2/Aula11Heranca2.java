/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11heranca2;

/**
 * herança para diferença
 */
public class Aula11Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("Claudiney");
        v1.setIdade(52);
        v1.setSexo("M");
        
        a1.setNome("Alexandre");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1123);
        a1.pagarMensalidade();
        
        b1.setNome("Maria");
        b1.setIdade(21);
        b1.setSexo("F");
        b1.setCurso("Informática");
        b1.setMatricula(829);
        b1.setBolsa(545.50f);
        b1.pagarMensalidade();
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
    }
    
}
