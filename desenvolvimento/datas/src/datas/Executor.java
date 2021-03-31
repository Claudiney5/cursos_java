package datas;

import jdk.swing.interop.SwingInterOpUtils;

public class Executor {

    public static void main(String[] args) {

        DataPadrao novaData = new DataPadrao();
        DataLonga dataLonga = new DataLonga();

        System.out.println("--- DATA ---");
        System.out.println(novaData.setData());
        System.out.println("--- DATA LONGA ---");
        System.out.println(dataLonga.getDataLonga());
        System.out.println(dataLonga.getCurrentTimeMills());
        System.out.println(dataLonga.getDataMillis());
    }



}
