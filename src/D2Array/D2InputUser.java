package D2Array;

import java.util.Scanner;

public class D2InputUser {
    public static void main(String[] args) {
        //take input to user
        int[][] brr=new int[5][6];

        //Scanner class define
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print("Enter the Array: ");;
                System.out.println();
                int arr=sc.nextInt();
//                System.out.print(brr[i][j]);
            }
            System.out.println();
        }
    }
}
