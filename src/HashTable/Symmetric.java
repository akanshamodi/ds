package HashTable;

import java.util.HashMap;

public class Symmetric {
    public static String symmetric(int[][] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        String result = "";

        //Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer value = hashMap.get(second);

            if (value != null && value == first) {
                //Symmetric Pair found
                result += "{" + String.valueOf(second) + "," + String.valueOf(first) + "}";
            } else
                hashMap.put(first, second);
        }
        return result;
    }
    public static void main(String args[]){
        int[][] arr={{1,2},{2,4},{3,6},{4,2}};
        System.out.println(symmetric(arr));
    }
}

