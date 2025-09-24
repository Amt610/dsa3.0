package D1Array;

public class ReverseArray {
    public static void main(String[] args) {
        //Reverse 1D Array
        int[] arr={2,3,5,6,8,6,4,7};

        //original array is
        for (int val:arr){
            System.out.print(" "+val);
        }


        System.out.println();
        //loops define for reverse array
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(" "+arr[i]);
        }
    }
}
