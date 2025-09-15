package D2Array;

public class D2ArrayInputData {
    public static void main(String[] args) {
        //create 2D array define all cell data
        int[][] arr={{2,5,5,2},{2,1,2,8},{8,6,8,7}};
        //print array all type of data
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Row length: "+arr.length);;
    }
}
