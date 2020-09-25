package Sorting;

public class MergeSort {
    //the time complexity of merge sort is nlogn
    public static void mergerSort(int[] arr,int lb,int ub){
        if(lb<ub) {
            int mid = (lb + ub) / 2;
            mergerSort(arr, lb, mid);
            mergerSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }
    public static void merge(int[] brr,int i,int mid,int k){
        int crr[] = new int[brr.length];
        int l = i;
        int c =i;
        int j=mid+1;
        while(i<= mid && j <= k){
            if(brr[i] <= brr[j]){
                crr[l] = brr[i];
                i++;
            }
            else{
                crr[l] = brr[j];
                j++;
            }
            l++;
        }
        if(i>mid){
            while(j<=k){
                crr[l]=brr[j];
                l++;
                j++;
            }
        }
       else if(j>k){
           while(i<=mid){
                crr[l]=brr[i];
                l++;
                i++;
           }
        }
        for(int p=c;p<=k;p++){
            brr[p] = crr[p];
        }
    }
    public static void main(String args[]){
        int arr[] = { 15,5,24,8,1,3,16,10,20};
        mergerSort(arr,0, arr.length-1);
       for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
