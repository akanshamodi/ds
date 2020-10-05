package BinarySearch;

import java.util.Scanner;

public class SearchMatrixWithBinary {
    public static boolean findKey(int[][] arr, int numberOfRows, int numberOfColumns, int target) {

        int min = 0;
        int max = numberOfRows * numberOfColumns - 1;

        while (min <= max)
        {
            int middle = (min + max) / 2;
            int row = middle / numberOfColumns;
            int col = middle % numberOfColumns;
            if (target < arr[row][col])
            {
                max = middle - 1;
            }
            else if (target >arr[row][col])
            {
                min = middle + 1;
            }
            else
            {
                return true;
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
