package D2Array;

public class D2MinimumeValue {
    public static void main(String[] args) {
        //Create java array
        int[][] arr={
                {1,5,3,6},
                {8,9,6,4},
                {6,7,7,1}
        };

        int min=arr[0][0];

        for(int[] row:arr){
            for (int val:row){
                if (val<min) min=val;
            }
        }
        System.out.println("Min = "+min);
    }
}
