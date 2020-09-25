package Sorting;

public class InsertionSort {
  //  The algorithm is in O(n^2)
    public static void Insert(int[] arr){
        int temp ;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp) {
                    arr[j + 1] = arr[j];
                    if (j == 0) {
                        arr[j] = temp;
                    }
                    else if(arr[j-1]<temp){
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {9,1,4,3,-7};
        Insert(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
