package one.innovation.digital;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiais = new HashMap<>();

        campeoesMundiais.put("Brasil", 6);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Italia", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha", 1);

        System.out.println( campeoesMundiais);

        // atualiza
        campeoesMundiais.put(null, 5);

        System.out.println( campeoesMundiais);

        // retorna Argentina
        System.out.println(campeoesMundiais.get("Argentina"));

        // verifica se tem França
        System.out.println("Existe França? " + campeoesMundiais.containsKey("França"));

        // retorna se existe alguma equipe 6 vezes campeã
        System.out.println("Existe 6 vezes campeã? " + campeoesMundiais.containsValue(6));

        // tamanho do mapa
        System.out.println("Tamanho: " + campeoesMundiais.size());

        // Navegando nos registros (iterando)
        for (Map.Entry<String, Integer> entrada : campeoesMundiais.entrySet()) {
            System.out.println(entrada.getKey() + " -- " + entrada.getValue());
        }

        for (String key: campeoesMundiais.keySet()) { // mais performática
            System.out.println(key + " ---- " + campeoesMundiais.get(key));
        }

        campeoesMundiais.clear();
        System.out.println(campeoesMundiais.size());

        System.out.println( campeoesMundiais.get(4));
    }

}
