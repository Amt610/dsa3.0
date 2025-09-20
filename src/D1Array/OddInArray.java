package D1Array;

public class OddInArray {
    public static void main(String[] args) {
        //create java array find how many odd value in array
        int[] arr={8,9,6,4,5,2,3};
        int count=0;

        for (int val:arr){
            if(val%2==1){
                count++;
            }
        }

        System.out.println("Odd Value Number is: "+count);
    }
}
