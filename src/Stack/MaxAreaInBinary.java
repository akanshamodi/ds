package Stack;
import java.util.Scanner;
import java.util.Scanner.*;

import static Stack.Histogram.histogram;

public class MaxAreaInBinary {
    public static void main(String args[]){
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner((System.in));
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
       System.out.println("The maximum area is "+MAIB(arr));
    }
    public static int MAIB(int[][] arr){
        int sum[] = new int[arr.length];
        int area = 0,maxArea=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length;j++){
                sum[j] = sum[j] + arr[i][j];
                if(arr[i][j]==0)
                    sum[j]=0;
            }
            area = histogram(sum);
            if(area>maxArea){
                maxArea = area;
            }

        }
        return maxArea;
    }
}
