package D1Array;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr={5,6,1,2,3,5,9,4};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int val:arr){
            if(val>first){
                second=first;
                first=val;
            } else if (val>second && val!=first) {
                second=val;
            }
        }
        System.out.println("Second largest number is: "+second);
    }
}
