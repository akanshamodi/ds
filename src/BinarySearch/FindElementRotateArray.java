package BinarySearch;
import static BinarySearch.BinarySearch.*;
import static BinarySearch.Rotation.*;
public class FindElementRotateArray {
    public static int findElement(int arr[],int start,int end,int e){
        int min = Rotation.rotation(arr,start,end);
        int n = BinarySearch.binarySearch(arr,start,min,e);
        int m = BinarySearch.binarySearch(arr,min+1,end,e);
        if(n==-1)
            return m;
        else if(m==-1)
            return n;
        else
            return 0;
    }
    public static void main(String args[]){
        int arr[] = {11,12,15,18,2,5,6,8};
        System.out.println("The index is "+findElement(arr,0, arr.length-1, 5));
    }
}
