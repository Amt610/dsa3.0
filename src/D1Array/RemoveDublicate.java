package D1Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
    public static void main(String[] args) {
        //Remove dublicate from java array
        int[] arr={11,22,33,11,22,44,55,66};
        Set<Integer> set=new HashSet<>();

        for (int val:arr){
            set.add(val);
        }

        for (int val:set){
            System.out.print(val+" ");
        }
    }
}
