package chapter15.common.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getcheckOut() {
        return checkOut;
    }
    
    public long Duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);        
    }

    /**
     * @param checkIn
     * @param checkOut
     */
    public void updatedDates(Date checkIn, Date checkOut){

        long diffIn = checkIn.getTime();
        long diffOut = checkOut.getTime();

        if(diffIn > diffOut){
            System.out.println("Invalid parameter: checkIn date greater than checkOut date!");
        }
        else{
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
    }
    
    @Override
    public String toString() {
        return "Room{"+
            "\n    roomNumber: " + roomNumber + 
            "\n    checkIn: " + sdf.format(checkIn) + 
            "\n    checkOut: " + sdf.format(checkOut) + 
            "\n    Duration: "+ Duration()+ " nights"+
            "\n }";
    }

}
