package BinarySearch;

public class FirstOccurence {
    public static int binarySearchF(int arr[],int start,int end,int n){
        if(arr.length<0){
            return -1;
        }
        if(arr.length==1){
            if(arr[0]==n)
                return 0;
        }
        int mid = (start+end)/2;
        int  z = -1;
        if(arr[mid]==n){
            z = mid;
        }
        if(arr[mid]>=n){
            for(int i=mid-1;i>=0;i--) {
                if (arr[i] == n)
                    z = i;
            }
        }
        else if(arr[mid]<=n){
            for(int i=mid+1;i<=end;i++){
                if(arr[i]==n){
                    z = i;
                }
            }
        }

        return z;
    }
    public static void main(String agrs[]){
        int arr[] = { 2,4,10,10,10,18,20};
        System.out.println("The First occurence is "+binarySearchF(arr,0, arr.length-1,10));
    }
}
