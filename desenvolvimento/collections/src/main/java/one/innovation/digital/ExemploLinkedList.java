package one.innovation.digital;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("sujeito1");
        filaBanco.add("sujeito2");
        filaBanco.add("sujeito3");
        filaBanco.add("sujeito4");
        filaBanco.add("sujeito5");
        filaBanco.add("sujeito6");

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.poll(); // mostra que é o primeiro elemnto da fila e o remove da fila

        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        System.out.println(filaBanco.peek()); // Mostra o primeiro elemento/não o tira da fila. Dá erro quando fila vazia.
        System.out.println(filaBanco);

        //alguns métodos de List funcionam.
        System.out.println(filaBanco.remove("sujeito5"));  // true
        System.out.println(filaBanco);

        // retorna o primeiro elemento da fila, mas não remove. Não dá erro quando esta vazia.
        System.out.println(filaBanco.element());


        for (String cliente: filaBanco) {
            System.out.println("-> " + cliente);
        }

        Iterator<String> iterador = filaBanco.iterator();

        while (iterador.hasNext()) {
            System.out.println("--> " + iterador.next());
        }

        filaBanco.clear();
        System.out.println(filaBanco.poll());

    }

}
