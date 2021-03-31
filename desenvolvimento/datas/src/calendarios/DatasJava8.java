package calendarios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasJava8 {

    public static void main(String[] args) {

        /* LocalDate:   imutável, data, padrão yyyy-MM-dd
         * LocalTime: imutável, hora-minuto segundo - 12:12:43:123456
         * LocalDateTime: imutável LocalDate + LocalTime
         */

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        LocalTime horaatual = LocalTime.now();
        LocalTime horafutura = horaatual.plusHours(1);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(10);

        System.out.println("Hoje: " + hoje);
        System.out.println("Ontem: " + ontem);
        System.out.println("-------------");
        System.out.println(horaatual);
        System.out.println(horafutura);
        System.out.println("-------------");
        System.out.println(agora);
        System.out.println(futuro);

    }

}
