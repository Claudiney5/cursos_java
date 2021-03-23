
package aula09relacionamentos;

public class Aula09Relacionamentos {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[10];
        Livro[] l = new Livro[10];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 32, "F");
        
        l[0] = new Livro("Selene", "Arthur Clarke", 222, p[0]);
        l[1] = new Livro("Fundação", "isaac Asimov", 198, p[1]);
        
        l[0].folhear(200);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        
    }
       
        
    
}
