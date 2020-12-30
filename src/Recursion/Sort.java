package Recursion;

public class Sort {
    public static void sort(int[] arr,int l){
        if(l==1){
            return;
        }
        int n = arr[l-1];
        l--;
        sort(arr,l);
        insert(arr,n,l);
    }
    public static void insert(int[] brr,int temp,int size){
        if(size==0 || brr[size-1]<=temp){
            brr[size] = temp;
            return;
        }
        int val = brr[size-1];
        size--;
        insert(brr, temp, size);
        brr[size+1] = val;
        return;
    }
    public static void main(String args[]){
        int arr[] = {2,3,7,6,4,5,9};
        int l = arr.length;
       Sort.sort(arr,l);
       int i=0;
       while(i<arr.length){
           System.out.println(arr[i]);
           i++;
       }

    }
}
