package strings;

public class StringFormat {
    
    public static void main(String[] args) {
        var nome = "Claudiney";
        var sobrenome = "Martins";
        final var nomeCompleto = nome + " " + sobrenome;
                
        System.out.println(nome);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Nome completo do Cliente: " + nomeCompleto);
        
        final var mensagem = String.format("O cliente %s possui sobrenome %s", nome, sobrenome);
        System.out.println(mensagem);
        
        System.out.println(String.format("numero %.2f", 1.2356));
    }
    
}
