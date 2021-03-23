package aula14exercicio;

public class Aula14Exercicio {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("aula 01 - Arduino");
        v[1] = new Video("aula 02 - Arduino");
        v[2] = new Video("aula 03 - Arduino");
        
        g[0] = new Gafanhoto("Jubileu", 31, "M", "juba"); 
        g[1] = new Gafanhoto("Creuza", 16, "F", "creuzita");         
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("-----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());        
    }
    
}
