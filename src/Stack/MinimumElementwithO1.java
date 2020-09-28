package Stack;

import java.util.Stack;

public class MinimumElementwithO1 {
    public static int Minimum(int arr[]) {
    Stack<Integer> s = new Stack<>();
    int min = arr[0];
    for(int i = 0; i<arr.length;i++) {
        s.push(arr[i]);
        if (s.peek() < min) {
            min = s.peek();
    }
    }
        return min;
}
    public static void main(String args[]){
        int arr[] = {18,19,20,15,16};
        System.out.println(Minimum(arr));
    }
}
