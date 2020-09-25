package Sorting;

import java.util.Scanner;
//The time complexity of the bubble sort is O(n^2)
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int swap;
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
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
        bubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
