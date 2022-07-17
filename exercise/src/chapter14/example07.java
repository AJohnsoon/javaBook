package chapter14;

import chapter14.entities.example07.entities.Circle;
import chapter14.entities.example07.entities.Rectangle;
import chapter14.entities.example07.entities.Shape;
import chapter14.entities.example07.enums.Color;

import java.util.ArrayList;
import java.util.Locale;

public class example07 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Shape sh1 = new Rectangle(Color.RED, 4.0, 5.0);
        Shape sh2 = new Circle(Color.BLUE, 3.0);

        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(sh1);
        shapesList.add(sh2);

        for (Shape sh: shapesList) {
            System.out.println(String.format("%.2f", sh.area()));
        }
        //System.out.println(shapesList);
    }
}
