package BinarySearch;

public class NextLetter {
    public static char Floor(char arr[],char n){
        int start =0,end = arr.length-1,mid=0;
        char f=' ';
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==n)
                return arr[mid+1];
            else if(arr[mid]>n)
                end = mid - 1;

            else {
                f = arr[mid+1];
                start = mid+1;
            }
        }
        return f;
    }
    public static void main(String args[]){
        char arr[] = {'a','b','f','h','i','j'};
        System.out.println(Floor(arr,'i'));
    }
}
