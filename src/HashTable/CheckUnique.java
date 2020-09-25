package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class CheckUnique {
    public static int findFirstUnique(int[] arr)
    {
        int result = 0;
        // write your code here
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                int occ = hmap.get(arr[i])+1;
                hmap.put(arr[i],occ);
            }
            else{
                hmap.put(arr[i],0);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hmap.get(arr[i])==0){
                result = arr[i];
                return result;
            }
        }
        return result;
    }
    public static void main(String args[]) {

        int[] arr = {2, 54, 7, 2, 6, 54};

        System.out.println("Array: " + Arrays.toString(arr));

        int unique = findFirstUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }
}

