package D1Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {


        int[] arr={2,5,6,8,9};

        //print all element using loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //print sum of all array element
        int sum=0;
        for (int x:arr) {
            sum+=x;
        }
        System.out.println("The sum of all element: "+sum);
    }
}
