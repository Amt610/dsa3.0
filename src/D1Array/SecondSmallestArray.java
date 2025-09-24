package D1Array;

public class SecondSmallestArray {
    public static void main(String[] args) {
        //create array
        int[] arr={2,3,5,6,8,9,7};

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for (int val:arr){
            if(val<first){
                second=first;
                first=val;
            } else if (val<second && val!=first) {
                second=val;
            }
        }
        System.out.println("Second Smallest value: "+second);
    }
}
