package Sorting;

import java.util.Scanner;
//the time complexity of the selection sort is O(n^2)
public class SelectionSort {
    public static void Selection(int[] arr){
        int swap;
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j < arr.length;j++){
                if(arr[i]>arr[j]){
                    swap  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Selection(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
