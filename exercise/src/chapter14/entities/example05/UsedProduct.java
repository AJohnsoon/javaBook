package chapter14.entities.example05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate = new Date();

    public UsedProduct(){}


    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return  "Used -> "+ this.getName()+"(used)  R$" + this.getPrice() + " - (" +   sdf.format(manufactureDate) + ")";
    }

    @Override
    public String toString() {
        return "\nUsedProduct {" +
                "\n UsedProduct Name: " + this.getName() +
                "\n UsedProduct Price: " + this.getPrice() +
                "\n Tag:" + priceTag() +
                "\n } \n";
    }
}
