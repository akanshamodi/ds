package Recursion;

public class JosephusProblem {
    public void Sword(int[] arr,int k,int index,int n){
        if(n==1){
            return;
        }
        index = (index + (k-1))%n;
        for(int j=index;j< n-1;j++){
            arr[j] = arr[j+1];
        }
        n = n-1;
        Sword(arr,k,index,n);
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5,6};
        int k = 2;
        JosephusProblem j = new JosephusProblem();
        j.Sword(arr, k, 0, arr.length);
        System.out.println(arr[0]);
    }
}
