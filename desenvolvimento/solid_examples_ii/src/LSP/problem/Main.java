package LSP.problem;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area: " + retangulo.getArea());
    }

    /* O programa calculará a área de um quadrado e não do retângulo. H á várias formas de resolver.
     */

}
