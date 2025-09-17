package D2Array;

public class EachEachLoop {
    public static void main(String[] args) {
        //create 2D array
        int[][] arr={
                {8,6,9,3,1,4},
                {7,5,6,2,4,3},
                {6,3,1,5,6,2},
                {9,6,3,2,5,3}
        };


        //print 2D Array
        for (int[] x:arr){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
