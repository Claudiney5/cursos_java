package datas;

import java.util.Date;

public class DataLonga {

    Date dataLonga = new Date();
    Long currentTimeMills = System.currentTimeMillis();
    Date dataMillis = new Date(currentTimeMills);

    public Date getDataLonga() {
        return dataLonga;
    }

    public Date getDataMillis() {
        return dataMillis;
    }

    public Long getCurrentTimeMills() {
        return currentTimeMills;
    }

}
