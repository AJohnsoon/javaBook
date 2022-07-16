package chapter14;

import chapter14.entities.example05.ImportedProduct;
import chapter14.entities.example05.Product;
import chapter14.entities.example05.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class example05 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product product = new Product("Notebook", 1100.00);
        Product importedProduct = new ImportedProduct("Tablet", 260.00, 20.00);
        UsedProduct usedProduct = new UsedProduct("Iphone", 400.00, sdf.parse("20/10/2020"));
        ArrayList<Product> productsTypes = new ArrayList<>();


        productsTypes.add(product);
        productsTypes.add(importedProduct);
        productsTypes.add(usedProduct);

        for (Product prod: productsTypes) {
            System.out.println(prod.priceTag());
        }

        //System.out.println(productsTypes);
    }
}
