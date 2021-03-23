
package aula05;

/**
 *
 * @author claudiney
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC");
        c1.depositar(15);
        c1.sacar(65 );
        c1.fecharConta();
    }
    
}
