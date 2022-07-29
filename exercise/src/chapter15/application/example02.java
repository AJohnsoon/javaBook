package chapter15.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import chapter15.common.entities.Reservation;

public class example02 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Reservation objectReservation = new Reservation(1325,  sdf.parse("25/11/2022"), sdf.parse("25/12/2022"));
        try{
            objectReservation.updatedDates(sdf.parse("01/10/2022"), sdf.parse("30/10/2022"));
        }
        catch(ParseException e){
            System.out.println("Date formatter error"+ e);
        }
        System.out.println(objectReservation);    
    }
}
