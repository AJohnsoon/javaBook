package chapter11;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class exampleDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleTwo = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat timeZoneGMT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        timeZoneGMT.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date myDate = simple.parse("20/12/1970");
        Date myDateTime = simpleTwo.parse("20/04/2022 01:32:08");
        Date personalDate = Date.from(Instant.parse("2020-10-21T15:42:07Z"));
        Date personalDateGMT = Date.from(Instant.parse("2020-10-21T22:48:07Z"));

        System.out.println("[Default Java]Date: " +myDate);
        System.out.println("[Default Java]DateTime: "+myDateTime);

        System.out.println("[UTC]Date: " +simple.format(myDate));
        System.out.println("[UTC]DateTime: "+simpleTwo.format(myDateTime));
        System.out.println("[UTC]PersonalDate: "+simpleTwo.format(personalDate));
        System.out.println("[GMT]Date time: "+timeZoneGMT.format(personalDateGMT));

        System.out.println("___________________________________________________");

        Date current = new Date();
        Date currentTwo = new Date(System.currentTimeMillis());
        Date currentThree = new Date(0L);
        Date currentFour = new Date(1000L * 60L * 60L * 5);

        System.out.println("Current Date: "+ simple.format(current));
        System.out.println("CurrentTwo Date: "+ simpleTwo.format(currentTwo));
        System.out.println("CurrentTwo Date: "+ simpleTwo.format(currentThree));
        System.out.println("CurrentTwo Four: "+ simpleTwo.format(currentFour));

    }
}
