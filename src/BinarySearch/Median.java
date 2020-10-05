package BinarySearch;

public class Median {

        public static double getMedian(int array1[], int array2[]) {
            int arr[] = new int[array1.length+array2.length];
            int i=0,j=0;
            double n;
            for(; i<array1.length && j<array2.length;)
            {
                if(array1[i]<array2[j])
                {
                    arr[i]=array1[i];
                    i++;
                }
                else if(array1[i]>array2[j]){
                    arr[j]=array2[j];
                    j++;
                }
                else{
                    arr[i]=array1[i];
                    i++;
                }
            }
            if(i==array1.length){
                while(j<array2.length){
                    arr[j]=array2[j];
                    j++;
                }
            }
            else if(j==array2.length){
                while(i<array1.length){
                    arr[i]=array1[i];
                    i++;
                }
            }
            if(arr.length %2==0)
                n = (arr[(arr.length/2)]+arr[arr.length/2-1])/2.0;
            else
                n =  arr[(arr.length/2)];
            return n;
        }
        public static void main(String args[]){
            int arr1[] = {5,8,10,11,20};
            int arr2[] = {900};
            System.out.println(getMedian(arr1,arr2));
        }
    }

