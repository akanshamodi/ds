package BinarySearch;
//the time complexity is now O(n + m).
import java.util.Scanner;

public class SearchMatrix {
    public static boolean findKey(int[][] arr, int numberOfRows, int numberOfColumns, int target) {
        int i=0,j=0;
        while(i<numberOfColumns-1 && j< numberOfRows) {
            if(arr[i+1][0]>target){
                if(arr[i][j] == target)
                    return true;
                else
                    j++;
            }
            else{
                i++;
            }

        }
        return false;
    }
    public static void main(String args[]){
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Boolean b = findKey(arr,4,4,30);
        System.out.println(b);
    }
}
