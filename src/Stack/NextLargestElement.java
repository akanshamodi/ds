package Stack;
import java.util.Stack;
public class NextLargestElement {
    public static int[] nextlargest(int[] arr){
        int brr[] = new int[arr.length];
        Stack<Integer> stack  = new Stack<>();
        for(int i= arr.length-1;i>=0;i--) {
            while (!stack.isEmpty()) {
                if (arr[i] < stack.peek()) {
                    brr[i] = stack.peek();
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                brr[i] = -1;
            }
            stack.push(arr[i]);
        }
        return brr;
    }
    public static void main(String args[]){
        int[] arr = {1,4,0,0,2};
        arr = nextlargest(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
