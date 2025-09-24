package D1Array;

public class FirstAndLastSwap {
    public static void main(String[] args) {
        //in array swap first and last element
        int[] arr={4,2,5,65,1,8};

        System.out.println("Showing without swap value");
        for (int val:arr) System.out.print(val+" ");
        //swap first and last element of array
        int temp=arr[0]; //access first element to array


        //showing after swaping value
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        System.out.println();
        System.out.println();
        System.out.println("Showing after swap");
        for (int val1:arr) System.out.print(val1+" ");
    }
}
