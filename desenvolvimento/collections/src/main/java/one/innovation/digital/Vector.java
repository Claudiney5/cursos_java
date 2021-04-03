package one.innovation.digital;

import java.util.List;

public class Vector {
    public static void main(String[] args) {
        List<String> defesas = new java.util.Vector<>();

        defesas.add("francesa");
        defesas.add("Caro-Kann");
        defesas.add("Siciliana");
        defesas.add("Alekhine");
        defesas.add("Ortodoxa");
        defesas.add("India do Rei");

        defesas.set(4, "India da Dama");
        System.out.println(defesas);
        defesas.remove(0);
        System.out.println(defesas);
        defesas.add(0,"Francesa");
        System.out.println(defesas);
        defesas.remove("India do Rei");
        System.out.println(defesas);
        System.out.println(defesas.get(0));

        for (String defesa: defesas) {
            System.out.println("-> " + defesa);
        }
    }

}
