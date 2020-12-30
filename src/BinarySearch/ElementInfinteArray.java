package BinarySearch;

import static BinarySearch.BinarySearch.binarySearch;


public class ElementInfinteArray {
    public static int Element(int arr[],int key){
        int start = 0,end = start+1;
        while(arr[end]<key){
            start = end;
            end = end * 2;
        }
        return binarySearch(arr,start,end,key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,6,7,8};
        int s =Element(arr,5);
        System.out.println(s);
    }
}
