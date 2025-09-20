package D2Array;

public class SnakMethod {
    public static void main(String[] args) {
        //create 2D array in java
        int[][] arr={
                {1,2,5,6,4},
                {7,8,9,5,6},
                {8,5,2,4,6},
                {8,6,3,4,5}
        };

        //print 2D array
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                for (int j = 0; j < arr[j].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for (int j = arr[i].length-1; j >=0; j--) {
                    System.out.println(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
