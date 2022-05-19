package chapter10.matriz;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class velhaMain {
    public int id;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int nPosition = 3;
        int xScore = 0;
        int oScore = 0;
        String draw = "";
        String response = " ";

        String[][] mat = new String[nPosition][nPosition];
        for (int u = 0; u < mat.length; u++) {
            System.out.printf(u + " | ");
        }
        System.out.println("<- Colum");
        System.out.println("________________");
        System.out.print(showMatriz(mat));
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Enter the value of line [" + i + "] of column [" + j + "] ");
                response = input.next();
                mat[i][j] = response;
                input.nextLine();
                System.out.println(showMatriz(mat));

            }

        }
        System.out.println(showMatriz(mat));

        if((mat[0][0].equals("x") && mat[1][1].equals("x") && mat[2][2].equals("x"))) {
            xScore++;
        }
        else if((mat[0][0].equals("o") && mat[1][1].equals("o") && mat[2][2].equals("o"))){
            oScore++;
        }

        else if((mat[0][0].equals("x") && mat[0][1].equals("x") && mat[0][2].equals("x"))){
            xScore++;
        }
        else if (mat[0][0].equals("o") && mat[0][1].equals("o") && mat[0][2].equals("o")) {
            oScore++;
        }

        else if((mat[1][0].equals("x") && mat[1][1].equals("x") && mat[1][2].equals("x"))){
            xScore++;
        }
        else if (mat[1][0].equals("o") && mat[1][1].equals("o") && mat[1][2].equals("o")) {
            oScore++;
        }
        else if((mat[2][0].equals("x") && mat[2][1].equals("x") && mat[2][2].equals("x"))){
            xScore++;
        }
        else if (mat[2][0].equals("o") && mat[2][1].equals("o") && mat[2][2].equals("o")) {
            oScore++;
        }

        else if((mat[0][0].equals("x") && mat[1][0].equals("x") && mat[2][0].equals("x"))){
            xScore++;
        }
        else if (mat[0][0].equals("o") && mat[1][0].equals("o") && mat[2][0].equals("o")) {
            oScore++;
        }

        else if((mat[0][1].equals("x") && mat[1][1].equals("x") && mat[2][1].equals("x"))){
            xScore++;
        }
        else if (mat[0][1].equals("o") && mat[1][1].equals("o") && mat[2][1].equals("o")) {
            oScore++;
        }

        else if((mat[0][2].equals("x") && mat[1][2].equals("x") && mat[2][2].equals("x"))){
            xScore++;
        }
        else if (mat[0][2].equals("o") && mat[1][2].equals("o") && mat[2][2].equals("o")) {
            oScore++;
        }




        System.out.println();
        System.out.println(" Score (x): "+ xScore + "\n Score (o): "+oScore + "\n Draw: "+draw);
        input.close();

    }


    public static String showMatriz(String[][] matriz) {
        StringBuilder output = new StringBuilder();
        for (String[] value : matriz) {
            for (int position = 0; position < matriz.length; position++) {
                if (value[position] == null) {
                    value[position] = " ";
                    output.append(value[position]).append(" | ");
                } else {
                    output.append(value[position]).append(" | ");
                }
            }
            output.append("<- line");
            output.append("\n");
        }

        return output.toString();


    }

    public static boolean getMatrizPosition(List<velhaMain> list, int id) {
        velhaMain emp = list.stream().filter(x -> x.id == id).findFirst().orElse(null);
        return emp != null;
    }

}
