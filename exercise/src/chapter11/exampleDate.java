package chapter11;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class exampleDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateZoneUTC = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dtZoneUTC = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat timeZoneGMT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        timeZoneGMT.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date myDate = dateZoneUTC.parse("20/12/1970");
        Date myDateTime = dtZoneUTC.parse("20/04/2022 01:32:08");
        Date personalDate = Date.from(Instant.parse("2020-10-21T15:42:07Z"));
        Date personalDateGMT = Date.from(Instant.parse("2020-10-21T22:48:07Z"));

        System.out.println("[Default]Date: " +myDate);
        System.out.println("[Default]DateTime: "+myDateTime);

        System.out.println("[UTC]Date: " +dateZoneUTC.format(myDate));
        System.out.println("[UTC]DateTime: "+dtZoneUTC.format(myDateTime));
        System.out.println("[UTC]PersonalDate: "+dtZoneUTC.format(personalDate));
        System.out.println("[GMT]Date time: "+timeZoneGMT.format(personalDateGMT));

        System.out.println("___________________________________________________");

        Date current = new Date();
        Date currentTwo = new Date(System.currentTimeMillis());
        Date currentThree = new Date(0L);
        Date currentFour = new Date(1000L * 60L * 60L * 5);

        System.out.println("Current Date: "+ dateZoneUTC.format(current));
        System.out.println("CurrentTwo Date: "+ dtZoneUTC.format(currentTwo));
        System.out.println("CurrentTwo Date: "+ dtZoneUTC.format(currentThree));
        System.out.println("CurrentTwo Four: "+ dtZoneUTC.format(currentFour));

    }
}
