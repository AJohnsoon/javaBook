package chapter10.array;

public class example04 {
    public static void main(String[] args){
        String[] vector = new String[] {"Maria", "Bob", "Alex", "Sadala"};
        long[] numberVector = new long[]{1,2,3,4,5,6,7,8,9};
        for(int position = 0; position < vector.length; position ++){
            System.out.println("["+position+"]" + vector[position]);
        }

        System.out.println("___________");

        for(String itemInVect : vector){
            System.out.println(itemInVect);
        }

        System.out.println("___________");

        for(long increment : numberVector){
            long number = 1;
            long result = increment + number;
            System.out.println(result);
        }

    }
}
