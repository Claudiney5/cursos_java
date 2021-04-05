package one.innovation.digital;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");
        // NÃO mantém a ordem !!!

        System.out.println(capitais);

        // retrona a primeira capital no topo da árvore
        System.out.println("Topo: " + capitais.first());

        // retorna a última capital da árvore
        System.out.println("Última: " + capitais.last());

        // retorna a primeira capital abaixo da árvore de capitais parametrizada
        System.out.println("Abaixo de Floripa: " + capitais.lower("Florianópolis"));

        // retorna a primeira capital acima da árvore da capitais parametrizada
        System.out.println(" Acima de Floripa: " + capitais.higher("Florianópolis"));

        // exibe todas as scapitais
        System.out.println(capitais);

        //retorna a primeira capital no topo, mas removendo ela do Set
        System.out.println("Removendo do topo " + capitais.pollFirst());

        //removendo do final da árvore
        System.out.println("removendo do final da árvore " + capitais.pollLast());

        System.out.println("------");

        // Iterando a árvore

        Iterator iterador = capitais.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("------");

        for (String capital: capitais) {
            System.out.println(capital);
        }

        System.out.println(capitais.contains("Curitiba"));

    }
}
