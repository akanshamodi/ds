package Stack;

import java.util.Stack;

public class StockSpan {
    public static int[] NLFL(int[] arr){
        Stack<pair(Integer,Integer)> stack = new Stack<>();
        int brr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                brr[i]=-1;
            }
            else if(stack.peek()<=arr[i]){
                while(!stack.isEmpty()){
                    stack.pop();
                    if(stack.isEmpty()){
                        brr[i]=-1;
                        break;
                    }
                    else if(stack.peek()>arr[i]){
                        brr[i] = stack.peek();
                        break;
                    }
                }
            }
            else{
                brr[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return brr;
    }
}
