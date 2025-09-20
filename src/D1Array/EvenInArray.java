package D1Array;

public class EvenInArray {
    public static void main(String[] args) {
        //create array and find even value
        int[] arr={8,9,6,5,1,2};
        int count=0;

        for (int val:arr){
            if (val%2==0){
                count++;
            }
        }

        System.out.println("Count value: "+count);
    }
}
