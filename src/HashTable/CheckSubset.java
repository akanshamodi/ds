package HashTable;

import java.util.HashSet;

public class CheckSubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        // write your code here
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            arr.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!arr.contains(arr2[i]))
                return false;
            return true;
        }

        return false;
    }
    public static boolean isDisjoint(int[] arr1,int[] arr2) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hset.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hset.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,9,7,6,4,3};
        int brr[] = {9,7,6};
        System.out.println(isSubset(arr,brr));
    }
}
