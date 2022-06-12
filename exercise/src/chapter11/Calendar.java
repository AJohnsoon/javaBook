package chapter11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Calendar {
    public static void main(String[] args){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateFrom = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println(dateFormat.format(dateFrom));

        java.util.Calendar cal =  java.util.Calendar.getInstance();
        cal.setTime(dateFrom);
        System.out.println("Calendar: "+cal);

        cal.add(java.util.Calendar.HOUR_OF_DAY, 4);
        dateFrom = cal.getTime();
        System.out.println("Add more (4) hour: "+ dateFormat.format(dateFrom));

        int getMinutes = cal.get(java.util.Calendar.MINUTE);
        System.out.println("Get Minutes: "+getMinutes);

        int getMonth = 1 + cal.get(java.util.Calendar.MONTH);
        System.out.println("Get Month: "+getMonth);
    }
}
