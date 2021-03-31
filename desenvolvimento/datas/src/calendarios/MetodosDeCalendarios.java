package calendarios;

import java.util.Calendar;

public class MetodosDeCalendarios {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, 2);
        System.out.println("2 meses para frente: " + agora.getTime());

    }

}
