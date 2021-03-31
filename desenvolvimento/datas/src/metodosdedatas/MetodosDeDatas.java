package metodosdedatas;

import java.time.Instant;
import java.util.Date;

public class MetodosDeDatas {

    public static void main(String[] args) {

        Date dataInicio = new Date(1013122480769L);
        Date dataNoPassado = new Date(151312480769L);
        Date dataNoFuturo = new Date(171710895116L);
        Date mesmaDataNoFuturo = new Date(171710895116L);

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter); // false

        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore); // true

        boolean isEqual = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEqual); // true

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
        System.out.println(compareCase1); // -1 -> data está atrás
        System.out.println(compareCase2); // 1 -> data esta à frente
        System.out.println(compareCase3); // 0

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);

        Aniversario aniversario = new Aniversario();
        Date data = new Date(-1013122480769L);
        int compareNiver = aniversario.getAniversario().compareTo(data);
        if (compareNiver > 0) {
            System.out.println("Não nasceu ainda!");
        } else {
            System.out.println("Já nasceu.");
        }

    }
}
