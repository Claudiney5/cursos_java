package strings;

public class ConstrutorDeStrings {
    
    public static void main(String[] args) {
        var nome = "Claudiney";
        
        final var builder = new StringBuilder(nome);
        System.out.println(builder.append(" Martins"));
        
        final var reverse = builder.reverse();
        System.out.println(reverse);
        
        final var insert = reverse.insert(0, "#").insert(reverse.length(), "$$");
        System.out.println(insert);    
    }
    
}
