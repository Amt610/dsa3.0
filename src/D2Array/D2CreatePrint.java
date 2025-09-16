package D2Array;

public class D2CreatePrint {
    public static void main(String[] args) {
        int[][] arr={
                {2,5,3,6},
                {5,6,7,6},
                {8,9,6,4}
                };
        
        //print array of java
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
