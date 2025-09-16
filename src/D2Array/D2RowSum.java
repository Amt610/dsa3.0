package D2Array;

public class D2RowSum {
    public static void main(String[] args) {
        //create 2D Array and sum of row
        int[][] arr={
                {1,2,5,3,4},
                {6,5,9,3,1},
                {7,5,9,6,2},
                {3,1,5,2,6,}
        };

        //sum of rows
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println("Row "+i+" sum "+sum);
        }
    }
}
