package Logic;

public class MaxMin {
    public static void main(String[] args) {
        //array max and min value find
        int[] arr={2,5,6,4,8,9};

        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }

            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);
    }
}
