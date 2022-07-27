package chapter15.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import chapter15.common.entities.Reservation;

public class example02 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Reservation objectReservation = new Reservation(1325,  sdf.parse("25/11/2022"), sdf.parse("25/12/2022"));
        objectReservation.updatedDates(sdf.parse("20/01/2022"), sdf.parse("10/12/2021"));
        System.out.println(objectReservation);
    }
}