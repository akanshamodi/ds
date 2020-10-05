package BinarySearch;
//This has the same time complexity as binary search: O(log(n)).
public class InsertPosition {
    public static int insertPosition(int arr[], int target)
    {
        if(arr.length<0)
            return -1;
        int start = 0,last = arr.length-1,mid = 0;
        while(start<=last){
            mid = (start+last)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else
                last = mid-1;
        }
        return last+1;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,6};
        System.out.println(insertPosition(arr,5));
    }
}
