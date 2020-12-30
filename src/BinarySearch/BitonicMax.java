package BinarySearch;

public class BitonicMax {
    public static int bitonic(int arr[]){
        int start = 0,end = arr.length;
        while(start<=end) {
            int mid = (start + end) / 2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
       return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,10,15,4,2,1};
        System.out.println(bitonic(arr));
    }
}
