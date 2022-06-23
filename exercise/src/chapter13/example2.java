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

import chapter13.entities.Worker;
import chapter13.entities.enums.WorkerLevel;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            Worker func1 = new Worker(input.nextLine(), WorkerLevel.valueOf(input.nextLine()), input.nextDouble());
            System.out.println(func1);
        }catch (Exception e){
            System.out.println("Wrong parameter, please try again !");
        }
    }
}
