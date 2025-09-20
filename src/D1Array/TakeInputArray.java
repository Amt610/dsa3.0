package D1Array;

import java.util.Scanner;

public class TakeInputArray {
    public static void main(String[] args) {
        //take input to user by using Scanner class
        Scanner sc=new Scanner(System.in);

        //create array programme
        System.out.print("Enter length of Array: ");
        int len= sc.nextInt();;
        int[] arr=new int[len];

        //take input and put on array
        System.out.println("Enter Element: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        //print element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
