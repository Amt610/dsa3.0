package D2Array;

public class forEachLoop {
    public static void main(String[] args) {
        //create java programme for loops practice
        int[][] arr={
                {1,2,5,3,5},
                {9,6,4,2,3},
                {9,4,5,3,6},
                {8,9,4,6,4}
        };

        //print array using for and each loop
        for (int i = 0; i < arr.length; i++) {
            for (int x:arr[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
