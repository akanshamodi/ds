package BinarySearch;
//The time complexity is O(logn)
import static BinarySearch.FirstOccurence.*;
import static BinarySearch.LastOccurence.*;
public class Count {
    public static int Count(int arr[],int n){
        int First = binarySearchF(arr,0,arr.length-1,n);
        int last = binarySearchL(arr,0,arr.length-1,n);
        return (last-First)+1;
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,10,10,10,10,23};
        System.out.println("The no of occurence "+Count(arr,10));
    }

}
