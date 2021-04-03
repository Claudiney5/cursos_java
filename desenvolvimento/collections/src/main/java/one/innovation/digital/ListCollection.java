package one.innovation.digital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Conan");
        nomes.add("Blator");
        nomes.add("Frodo");
        nomes.add("Rosa Negra");
        nomes.add("Kull");

        System.out.println("---------------");
        System.out.println(nomes);

        Collections.sort(nomes); // ordenando itens
        System.out.println(nomes);
        System.out.println( "Tamanho: " + nomes.size()); // tamanho
        nomes.set(4, "Vallery");  // alterando item
        System.out.println("Nome agora na posição 4: " + nomes.get(4));  // verifica quem item tem no index
        System.out.println(nomes.remove(0));  // remove item 0 da Lista
        System.out.println(nomes);
        System.out.println("Posição de Vallery: " + nomes.indexOf("Vallery"));
        System.out.println(nomes.contains("Kull"));
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.indexOf("nome inexistente"));
        System.out.println("------");

        for (String nome: nomes ) {   // iterando com o forEach
            System.out.println("-> " + nome);
        }

        System.out.println("------");

        Iterator iterador = nomes.iterator();

        while (iterador.hasNext()) {  // enquanto tiver próximo item
            System.out.println("--> " + iterador.next());
        }

        nomes.clear();
        System.out.println(nomes);
    }
}
