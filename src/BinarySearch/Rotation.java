package BinarySearch;
//The time complexity is O(logn)
public class Rotation {
    public static int rotation(int arr[],int start,int last){
        int mid = 0;

            mid = (start+last)/2;
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1])
            return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
               mid = rotation(arr,start,mid-1);
            else
                mid = rotation(arr,mid+1,last);
        return mid;
    }
    public static void main(String args[]){
        int arr[] = {11,12,15,18,2,3,5,6,8};
        System.out.println("The no of rotation is "+rotation(arr,0, arr.length-1));
    }
}
