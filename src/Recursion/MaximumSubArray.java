package Recursion;

public class MaximumSubArray {
    static int[] brr = new int[20];
    static int  k = 3;
    public  void MaximumArray(int[] arr,int left,int Right){
        if(Right==arr.length){
            return;
        }
        max(arr,left,Right,arr[left]);
        MaximumArray(arr,left+1,Right+1);


    }
 public void max(int[] arr,int i,int j,int max){
        if(max<arr[i]){
            max = arr[i];
        }
         if(i==j){
            brr[i-(k-1)] = max;
            return ;
        }
         max(arr,i+1,j,max);

 }
 public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        MaximumSubArray s = new MaximumSubArray();
        s.MaximumArray(arr,0,k-1);
        for(int i=0;i<arr.length-2;i++){
            System.out.println(brr[i]);
        }
 }
}
