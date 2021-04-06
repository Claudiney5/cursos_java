package one.innovation.digital.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparator {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("---- Ordem de inserção ----");
        System.out.println(estudantes);

        // lambda - aconselhável quando não se tem muito acomplamento.
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());  // lambda
        System.out.println("---- Ordem natural dos números - idade ----");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("---- Ordem reversa dos números - idade");
        System.out.println(estudantes);

        // Usando método da classe Comparator
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---- Ordem natural dos números - idade (method reference) ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---- Ordem reversa dos números - idade (method reference) ----");
        System.out.println(estudantes);

        // Usando o método sort da classe Collections. O objeto precisa EXTENDER Comparable
        Collections.sort(estudantes);
        System.out.println("---- Ordem natural dos números - idade (interface Comparable) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("---- Ordem reversa dos números - idade (interface Comparator) ----");
        System.out.println(estudantes);

    }
}
