package HashTable;

import java.util.HashMap;

public class CheckSubZero {
    public static Boolean subarray(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
            if(arr[i]==0 || sum==0 || hmap.get(sum)!=null)
                return true;
            hmap.put(sum,i);
        }
        return false;
    }
    public static void main(String args[]) {

        int[] arr = {6, 4, 7, 3, 12, 9};
        System.out.println(subarray(arr));

    }
}

