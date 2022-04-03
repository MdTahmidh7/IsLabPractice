package Practice1;

import java.util.Scanner;

public class DoubleTranspose {
    public static void main(String[] args) {
        System.out.println("Enter row value : ");
        int row,column;
        Scanner s = new Scanner(System.in);
        row = s.nextInt();
        System.out.println("Enter column value : ");
        column = s.nextInt();
        String [][] matrix = new String[row][column];
        String [][] matrix1 = new String[row][column];
        int [] rowSequence = new int[row];
        int [] columnSequence = new int[column];

        System.out.println("Enter  values : ");

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                matrix[i][j] = s.next();
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }


        /*Row Transposition*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter row new sequence : ");
        for (int i = 0; i <rowSequence.length; i++) {
            rowSequence[i] = scanner.nextInt();
        }

        for (int i = 0; i <3 ; i++) {
            if(i==0){
                for (int j = 0; j <3 ; j++) {
                    matrix1[i][j] = matrix[rowSequence[i]][j];
                }
            }
            if(i==1){
                for (int j = 0; j <3 ; j++) {
                    matrix1[i][j] = matrix[rowSequence[i]][j];
                }
            }
            if(i==2){
                for (int j = 0; j <3 ; j++) {
                    matrix1[i][j] = matrix[rowSequence[i]][j];
                }
            }
        }

        System.out.println("---------------------------");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println( );
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
               matrix [i][j] = matrix1 [i][j];
            }

        }



        /*Column Transposition */

        System.out.println(" Enter column new sequence : ");
        for (int i = 0; i <columnSequence.length; i++) {
            columnSequence[i] = scanner.nextInt();
        }
        for (int j = 0; j <3 ; j++) {
            if(j==0){
                for (int i = 0; i <3 ; i++) {
                    matrix1[i][j] = matrix[i][columnSequence[j]];
                }
            }
            if(j==1){
                for (int i = 0; i <3 ; i++) {
                    matrix1[i][j] = matrix[i][columnSequence[j]];
                }
            }
            if(j==2){
                for (int i = 0; i <3 ; i++) {
                    matrix1[i][j] = matrix[i][columnSequence[j]];
                }
            }
        }



        System.out.println("------------- Final Matrix --------------");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println( );
        }

    }
}
