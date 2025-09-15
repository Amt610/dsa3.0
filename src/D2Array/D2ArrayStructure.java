package D2Array;

public class D2ArrayStructure {
    public static void main(String[] args) {
        //create 2D Array
        int[][] arr=new int[4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println(arr.length);

    }
}
