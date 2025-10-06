package D1Array;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={8,5,6,9,4,2,7};

        System.out.println("Before Sorting Array");
        for (int val1:arr){
            System.out.print(val1+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("After Sorting Array");
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
