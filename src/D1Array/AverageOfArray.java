package D1Array;

public class AverageOfArray {
    public static void main(String[] args) {
        //create array
        int[] arr={2,3,5,6,7,8};

        //print all element
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //print average and sum of array programme
        int sum=0;
        int average=0;
        for (int x:arr){
            sum+=x;
            average=sum/ arr.length;
        }
        System.out.println("Average Value is: "+average);
        System.out.println("Sum Value is: "+sum);
    }
}
