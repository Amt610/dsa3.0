package D2Array;

import java.util.Scanner;

public class D2TakeInput {
    public static void main(String[] args) {
        //Create Scanner class
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row= sc.nextInt();
        System.out.print("Enter number of Col: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.print("Enter element: ");

        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        //print array list
        System.out.println("Printing.. 2D Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
