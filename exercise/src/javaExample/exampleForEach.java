package javaExample;

public class exampleForEach {
    public static void main(String[] args){
       int[] numbers = {1,2,3,4,5,6,7,8,9,10};
       for(int i=0; i<=numbers.length; i++){
           System.out.println("Count[i] is: "+i);
       }
        System.out.println("_____________________");
        for(int item : numbers){
            System.out.println("Count[item] is: "+item);
        }
    }
}
