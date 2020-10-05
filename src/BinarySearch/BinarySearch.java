package BinarySearch;
//The time complexity is o(logn)
public class BinarySearch {
    public static int binarySearch(int arr[],int start,int end,int n){
        if(arr.length<0){
            return -1;
        }
        if(arr.length==1){
            if(arr[0]==n)
                return 0;
        }
        int mid = (start+end)/2;
        if(arr[mid]<n){
            for(int i=mid;i<=end;i++){
                if(arr[i]==n)
                    return i;
            }
        }
        else if(arr[mid]>n){
            for(int i=mid;i>=0;i--){
                if(arr[i]==n)
                    return i;
            }
        }
        else{
            return mid;
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,0, arr.length-1,2 ));

    }
}
