package strings;

public class Strings {

    public static void main(String[] args) {
        
        var nome = "Claudiney";
        var sobrenome = "Martins";
        var posicao = 5;
        
        final var nomeCompleto = nome + sobrenome;
        
        System.out.println(nome);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Nome completo do Cliente: " + nomeCompleto);
        
        var string = new String(" Minha  String ");
        
        System.out.println("Char na posição " + posicao + ": " + string.charAt(posicao) );
        System.out.println("Quantidade: " + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Minúsculas: " + string.toLowerCase());
        System.out.println("Maiúsculas: " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));
        System.out.println("Substitui: " + string.replace("n", "X"));
        System.out.println("Iguais? " + string.equals(" Minha String "));
        System.out.println("Iguais? " + string.equals(" Minha  String "));
        System.out.println("Iguais ignorando Caixa: " + string.equalsIgnoreCase(" minHa  STRINg "));
        System.out.println("String menor: " + string.substring(1, 6));

    }
    
}
