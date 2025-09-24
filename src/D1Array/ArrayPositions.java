package D1Array;

public class ArrayPositions {
    public static void main(String[] args) {
        //create java programme for array position
        int[] arr={10, 20, 30, 40, 50};

        System.out.println("Even Element Position");
        for (int i = 0; i < args.length; i+=2) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nOdd Element Position");
        for (int i = 0; i < args.length; i+=2) {
            System.out.print(arr[i]+" ");
        }
    }
}
