package one.innovation.digital;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
                
        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");
        capitais.put("MS", "Campo Grande");
        capitais.put("ES", "Vitória");

        System.out.println(capitais);

        // retorna topo da árvore
        System.out.println(capitais.firstKey());

        // retorna última folha
        System.out.println(capitais.lastKey());

        // retorna a capital abaixo da parametrizada
        System.out.println(capitais.lowerKey("SC"));

        // retorna a capital acima da parametrizada
        System.out.println(capitais.higherKey("SC"));

        // retorna a primeira capital no topo da árvore
        System.out.println(capitais.firstEntry().getKey() + " - " + capitais.firstEntry().getValue());

        // retorna a última capital no final da árvore
        System.out.println(capitais.lastEntry().getKey() + " - " + capitais.lastEntry().getValue());

        // retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(capitais.lowerEntry("PR").getKey() + " -- " + capitais.lowerEntry("PR").getValue());

        // retorna a primeira capital no topo e REMOVE ela do map
        Map.Entry<String, String> primeiraEntrada = capitais.pollFirstEntry();
        System.out.println(primeiraEntrada.getKey() + ": " + primeiraEntrada.getValue());

        // Outra maneira: neste caso retorna a última capital REMOVENDO-A
        System.out.println(capitais.pollLastEntry().getKey() + ": " + capitais.pollLastEntry().getValue());

        System.out.println(capitais);

        Iterator<String> iterador = capitais.keySet().iterator();
        while (iterador.hasNext()){
            String chave = iterador.next();
            System.out.println(chave + "-> " + capitais.get(chave));
        }

        for (String capital: capitais.keySet()) {
            System.out.println(capital + "--> " + capitais.get(capital));
        }

        for (Map.Entry<String, String> capital: capitais.entrySet()) {
            System.out.println(capital.getKey() + "-->> " + capital.getValue());
        }
    }
}
