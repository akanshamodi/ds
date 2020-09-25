package Stack;

import java.util.Stack;

public class StockSpan {
    public static int[] NLFL(int[] arr){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int brr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                brr[i]=-1;
            }
            else if(stack.peek().second<=arr[i]){
                while(!stack.isEmpty()){
                    stack.pop();
                    if(stack.isEmpty()){
                        brr[i]=-1;
                        break;
                    }
                    else if(stack.peek().second>arr[i]){
                        brr[i] = stack.peek().first;
                        break;
                    }
                }
            }
            else{
                brr[i] = stack.peek().first;
            }
            stack.push(Pair.of(arr[i],i));
        }
        return brr;
    }
    public static void main(String args[]){
        int arr[] = {100,80,60,70,60,75,85};
        int index[] = NLFL(arr);
        for(int i=0;i< index.length;i++){
            System.out.println(i-index[i]);
        }
    }
}
