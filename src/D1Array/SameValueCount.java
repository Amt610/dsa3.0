package D1Array;

public class SameValueCount {
    public static void main(String[] args) {
        //create index value how java programme in array
        int[] arr={2,3,56,15,2,15,3,2};
        int key=2;
        int count=0;

        //forEach loops
        for (int val:arr){
            if (val==key){
                count++;
            }
        }

        System.out.println("Key value is: "+key+" Count same number is: "+count);
    }
}
