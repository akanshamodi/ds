package Sorting;
import static Sorting.QuickSort.quickSort;
//the overall time complexity of this algorithm is in O(nlog(n)).
public class SumUpton {
        public static int[] findSum(int[] arr, int n) {
            int[] result = new int[2];
            quickSort(arr, 0, arr.length - 1);
            int start = 0, end = arr.length - 1;
            int sum = 0;
            while (start != end) {
                sum = arr[start] + arr[end];
                if (sum > n)
                    end--;
                else if (sum < n)
                    start++;
                else {
                    result[0] = arr[start];
                    result[1] = arr[end];
                    return result;
                }

            }
            return arr;
        }
        public static void main(String args[]){
            int arr[] = {3,2,5,7,6};
            int result[] = findSum(arr,5);
            for(int i=0;i< result.length;i++)
                System.out.println(result[i]);

        }
    }

