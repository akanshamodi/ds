package BinarySearch;

import static BinarySearch.FindCeil.Ceil;
import static BinarySearch.FindFloor.Floor;
//Minimum difference between in the sorted array.
public class MinimumDifference {
    public static int minDif(int arr[],int key){
        int n = Floor(arr,key);
        int m = Ceil(arr,key);
        if((key-n)<(m-key)){
            return key-n;
        }
        else{
            return m-key;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,8,10,12,15};
        System.out.println(minDif(arr,5));
    }
}
