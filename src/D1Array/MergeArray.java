package D1Array;

public class MergeArray {
    public static void main(String[] args) {
        //create java array programme
        int[] a={25,15,63,17,66};
        int[] b={87,85,62,26,14};
        int[] c= new int[a.length+ b.length];
        int k=0; //declare 0 for array element merging should be required

        //merge two array in java programming
        //merge element a
        for (int val:a){
            c[k++]=val;
            System.out.print(" "+val);
        }
        System.out.println();

        //merge element  b
        for (int val:b){
            c[k++]=val;
            System.out.print(" "+val);
        }
        System.out.println();


        //merge element c
        for (int val:c){
            System.out.print(val+" ");
        }
    }
}
