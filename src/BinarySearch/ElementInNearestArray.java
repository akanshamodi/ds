package BinarySearch;

public class ElementInNearestArray {
    public static int findElement(int arr[],int start,int end,int n){
        int mid = (start+end)/2;
        if(mid>1) {
            if (arr[mid] == n)
                return mid;
            else if (arr[mid - 1] == n)
                return mid - 1;
            else if (arr[mid + 1] == n)
                return mid + 1;
            if(arr[mid-1]>n)
            mid = findElement(arr, start, mid - 2, n);
            else if(arr[mid+1]<n)
            mid = findElement(arr, mid + 2, end, n);
        }
        return mid;
    }
    public static void main(String args[]){
        int arr[] = {5,10,30,20,40};
        System.out.println("The index is "+findElement(arr,0, arr.length-1, 5));
    }
}
