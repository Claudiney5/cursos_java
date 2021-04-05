package one.innovation.digital;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequencia = new LinkedHashSet<>();

        sequencia.add(1);
        sequencia.add(2);
        sequencia.add(4);
        sequencia.add(8);
        sequencia.add(16);
        // mantém a ordem !!!
        sequencia.add(2);

        System.out.println(sequencia);

        // remove item
        System.out.println("Removeu 4? " + sequencia.remove(4));
        System.out.println(sequencia);

        // retorna a quantidade de itens
        System.out.println(sequencia.size());

        // iteradores
        Iterator<Integer> iterador = sequencia.iterator();
        System.out.println("--------");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("-------");
        for (Integer numero: sequencia) {
            System.out.println(numero);
        }

        System.out.println("--------");

        System.out.println("Sequência vazia? " + sequencia.isEmpty());
        sequencia.clear();
        System.out.println("Sequência vazia? " + sequencia.isEmpty());
        System.out.println(sequencia);


    }
}
