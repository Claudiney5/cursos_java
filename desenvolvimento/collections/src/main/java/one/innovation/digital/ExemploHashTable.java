package one.innovation.digital;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> campeoesMundiais = new Hashtable<>();

        campeoesMundiais.put("Brasil", 6);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Italia", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha", 1);

        System.out.println(campeoesMundiais);

        campeoesMundiais.put("Brasil", 5);

        // remove registro
        campeoesMundiais.remove("França");
        System.out.println(campeoesMundiais);

        //recupera registro
        int campeonatos = campeoesMundiais.get("Inglaterra");
        System.out.println(campeonatos);

        //tamanho
        System.out.println("Tamanho: " + campeoesMundiais.size());
        campeoesMundiais.put("França", 2);
        System.out.println("Tamanho: " + campeoesMundiais.size());

        // iteração
        for (Map.Entry<String, Integer> entrada : campeoesMundiais.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        for (String key: campeoesMundiais.keySet()) {
            System.out.println(key + " -- " + campeoesMundiais.get(key));
        }



    }
}
