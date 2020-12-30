package BinarySearch;

public class Peak {
    public static int peak(int arr[]){
        int start = 0, end = arr.length;
        while(start<=end) {
            int mid = (start + end) / 2;
            if(arr[mid]>arr[mid+1] && mid-1<0){
                return arr[mid];
            }
            else if(arr[mid]>arr[mid-1] && mid+1>=arr.length){
                return arr[mid];
            }
            else if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            }
            else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {30,25,35,20,15};
        System.out.println(peak(arr));
    }
}
