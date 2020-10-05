package BinarySearch;
public class FindFloor {
    public static int Floor(int arr[],int n){
        int start =0,end = arr.length-1,mid=0,f=0;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==n)
                return arr[mid];
            else if(arr[mid]<n)
                start = mid+1;
            else {
                f = arr[mid-1];
                end = mid - 1;
            }
        }
        return f;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,8,9,10};
        System.out.println(Floor(arr,6));
    }
}
