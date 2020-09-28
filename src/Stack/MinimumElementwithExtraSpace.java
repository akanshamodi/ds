package Stack;

import java.util.Stack;

public class MinimumElementwithExtraSpace {
    public static int Minimum(int arr[]){
        Stack<Integer> s = new Stack<>();
        Stack<Integer> ss = new Stack<>();
        for(int i=0;i< arr.length;i++){
            s.push(arr[i]);
            if(ss.isEmpty()){
                ss.push(s.peek());
            }
            else if(s.peek()<ss.peek()){
                ss.push(s.peek());
            }
        }
        return ss.peek();
    }
    public static void main(String args[]){
        int arr[] = {18,19,20,15,16};
        System.out.println(Minimum(arr));
    }
}
