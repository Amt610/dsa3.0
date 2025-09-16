package D2Array;

public class D2ColSum {
    public static void main(String[] args) {
        //java 2D Col sum
        int[][] arr={
                {1,5,2,6},
                {2,6,3,4},
                {8,3,6,4}
        };

        for (int j = 0; j < arr[0].length; j++) {
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i][j];
            }
            System.out.println("Col "+j+" Sum of Col "+sum);
        }
    }
}
