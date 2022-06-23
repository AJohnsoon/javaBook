/*
* Composição:
*  É um tipo de associação que permite que um objeto conheta outro;
*  - Relação -> "tem-um" ou "tem-vários"
*  - Vantagens:
*       - Organização -> divisão de responsabilidades
*       - Coesão
*       - Flexibilidade
*       - Reuso
*/
package chapter13;

import chapter13.entities.Contract;
import chapter13.entities.Worker;
import chapter13.entities.enums.WorkerLevel;

import java.util.*;

public class example2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        try{
            Worker worker = new Worker("Example", WorkerLevel.valueOf("MID_LEVEL"), 8000.00);

            System.out.println("Enter a number of contracts to add: ");
            int contractCount = input.nextInt();

            for(int i = 0; i<contractCount; i++){
                System.out.println("Contract Date Limit: ");
                String inputDate = input.next();
                input.nextLine();

                System.out.println("Value Por Hour: ");
                double valueHour = input.nextDouble();

                System.out.println("Worked Hour: ");
                int inputHour = input.nextInt();

                Contract contract = new Contract(new Date(inputDate), valueHour, inputHour );
                worker.setContract(contract);
            }
            System.out.println(worker);
        }catch (Exception e){
            System.out.println("Wrong parameter, please try again !");
        }
    }
}
