package D1Array;

public class MinumValueInArray {
    public static void main(String[] args) {
        //create array
        int[] arr={2,3,4,5,7,9};

        int min=arr[0];

        for (int val:arr){
            if (val<min){
                min=val;
            }
        }
        System.out.println("Minimum value is: "+min);
    }
}
