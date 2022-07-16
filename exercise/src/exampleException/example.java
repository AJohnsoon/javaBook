package exampleException;

import java.util.ArrayList;

public class example {
   public static void main(String[] args){
       ArrayList<String> exampleList = new ArrayList<>();
       exampleList.add("Allan");
       exampleList.add("Pedro");
       exampleList.add(null);
       exampleList.add("Maria");
       exampleList.add("Mayara");
       exampleList.add(null);
       exampleList.add("Alexandre");
       exampleList.add("Theo");

       for(String name : exampleList){
           if(name != null){
               System.out.println("Order Name: "+ name);
           }
       }
   }
}
