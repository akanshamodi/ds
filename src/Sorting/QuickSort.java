package Sorting;
//The best case complexity is nlogn
public class QuickSort {
    public static int partion(int arr[],int lb,int ub){
        int pivot = arr[lb];
        int start  = lb;
        int end = ub;
        while(end > start){
            while(start < arr.length && arr[start]<=pivot){
                start++;
            }
            while( arr[end]>pivot){
                end--;
            }
            if(end>start) {
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        if(start > end){
            int temp = pivot;
            arr[lb] = arr[end];
            arr[end] = temp;
        }
        return end;
    }
    public static void quickSort(int[] arr,int lb,int ub){
        if(lb<ub){
            int loc = partion(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }
    public static void main(String args[]){
        int arr[] = {7,6,10,13,9,2,1,-5,7};
        quickSort(arr,0, arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
