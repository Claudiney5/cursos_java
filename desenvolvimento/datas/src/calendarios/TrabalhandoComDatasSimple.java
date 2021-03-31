package calendarios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TrabalhandoComDatasSimple {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        String dataFormatada = formato.format(agora);

        System.out.println(dataFormatada);
    }
}
