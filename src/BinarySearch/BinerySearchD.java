package BinarySearch;

public class BinerySearchD {
    public static int binarySearchD(int arr[],int start,int end,int n){
        if(arr.length<0){
            return -1;
        }
        if(arr.length==1){
            if(arr[0]==n)
                return 0;
        }
        int mid = (start+end)/2;
        if(arr[mid]>n){
            for(int i=mid;i<=end;i++){
                if(arr[i]==n)
                    return i;
            }
        }
        else if(arr[mid]<n){
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
        int arr[] = {9,8,7,6,5,4,3,2,1};
        System.out.println(binarySearchD(arr,0, arr.length-1,6 ));

    }
    }

