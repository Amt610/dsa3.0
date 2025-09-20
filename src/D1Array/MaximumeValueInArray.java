package D1Array;

public class MaximumeValueInArray {
    public static void main(String[] args) {
        //find maximum value in array
        int[] arr={5,6,3,1,8,6};
        int max=arr[0];

        for (int val:arr){
            if (val>max){
                max=val;
            }
        }
        System.out.println("Max value is: "+max);
    }
}
