package strings;

public class Exercicios {
    
    public static void main(String[] args) {
        var letras = "A B C D E F G";
        var titulo = "Aula de Java";
        var aula = "Aula";
        var asda = "1234 asda qw";
        
        System.out.println(letras.toCharArray());
        System.out.println(titulo.split(""));
        System.out.println(aula.concat(" de Java 2"));
        System.out.println(asda.replaceAll("[0-9]", "#"));
    
    }
    
}
