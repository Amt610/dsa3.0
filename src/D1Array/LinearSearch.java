package D1Array;

public class LinearSearch {
    public static void main(String[] args) {
        //create 1D array
        int[] arr={21,5,34,62,45};
        int key=34;
        int index=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                index=i;
                break;
            }
        }

        System.out.println("Index value is: "+index);
    }
}
