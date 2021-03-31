package calendarios;

import java.text.DateFormat;
import java.util.*;

public class TrabalhandoComDatas {

    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // DATA NO PADRÃO lONGO E HORA NO PADRÃO cURTO

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);

    }
}
