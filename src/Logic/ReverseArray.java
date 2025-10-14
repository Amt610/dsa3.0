package Logic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //Reverse Array programme
        int[] arr={2,5,3,6,4,5};

        int n= arr.length-1;

        System.out.println("Original Array: "+ Arrays.toString(arr));

        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length-1; i++) {
//            System.out.print(arr[i]+" ");
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }

        System.out.print(Arrays.toString(arr));
    }
}
