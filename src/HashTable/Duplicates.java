package HashTable;
//The time complexity of this version is in O(n) since the input array is iterated over once.
// The auxiliary space used is equal to O(1).
import java.util.ArrayList;
import java.util.HashMap;

public class Duplicates {
    public static ArrayList < Integer > findDuplicates(int[] arr) {
        ArrayList < Integer > duplicates = new ArrayList< Integer >();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i]))
                duplicates.add(arr[i]);
            else
                hmap.put(arr[i],i);
        }

        // write your code here

        return duplicates;
    }
    public static void main(String args[]){
        int arr[] = {1, 3, 4, 3, 5, 4, 100, 100};
        ArrayList<Integer> dupes = findDuplicates(arr);
        System.out.println("The duplicates is "+dupes);
    }
}
