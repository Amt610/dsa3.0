package D1Array;

public class CopyArray {
    public static void main(String[] args) {
        //Original Array
        int[] arr={1,2,5,3,5,6,4};
        int[] copied=new int[arr.length];

        //copy all element by using loops
        for (int i = 0; i < arr.length; i++) {
            copied[i]=arr[i];
        }

        System.out.println("Copied Array");
        for (int val:copied){
            System.out.print(" "+val);
        }
        System.out.println();
    }
}
