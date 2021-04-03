public class Vetores {

    public static void main(String[] args) {

        // declaração de Arrays
        int[] vetor1 = new int[7];
        int[] vetor2 = {12,7,52,10,4,9,62};

        int[][] matriz = {{12,7,52,10,4,9,62}, {5,5,5,5,5,5,5}, {1,2,3,4,5,6,7}, vetor1};


        System.out.println(vetor1);  // imprime o espaço na memória alocado.
        System.out.println(vetor2);


        // Alterando Array

        System.out.println(vetor2[3]);
        vetor2[3] = 11;
        System.out.println(vetor2[3]);

        // Iterando Array
        for (var i = 0; i < vetor2.length ; i++ ) {
            System.out.print(i + ": ");
            System.out.println(vetor2[i]);
        }

        for (var i = 0; i < matriz.length; i++ ) {
            System.out.print("[ ");
            for (var j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }

        // Alterando valor da matriz
        
        matriz[3][1] = 1;
        for (var i = 0; i < matriz.length; i++ ) {
            System.out.print("[ ");
            for (var j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }

    }

}
