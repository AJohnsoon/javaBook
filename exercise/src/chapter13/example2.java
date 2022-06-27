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
import chapter13.entities.Department;
import chapter13.entities.Worker;
import chapter13.entities.enums.WorkerLevel;

import java.text.SimpleDateFormat;
import java.util.*;

public class example2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department department = new Department("Design");
        try{
            Worker worker = new Worker("Example", WorkerLevel.valueOf("MID_LEVEL"), 12000.00, department);

            System.out.println("Enter a number of contracts to add: ");
            int contractCount = input.nextInt();

            for(int i = 0; i<contractCount; i++){
                System.out.println("Contract Date Limit: ");
                Date inputDate = sdf.parse(input.next());
                input.nextLine();

                System.out.println("Value Por Hour: ");
                double valueHour = input.nextDouble();

                System.out.println("Worked Hour: ");
                int inputHour = input.nextInt();

                Contract contract = new Contract( inputDate, valueHour, inputHour );
                worker.addNewContract(contract);
            }
            String monthAndYear = "08/2018";
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));

            System.out.println(worker);
            System.out.println("_____________________________________");
            System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        }catch (Exception e){
            System.out.println("Wrong parameter, please try again !");
        }
    }
}
