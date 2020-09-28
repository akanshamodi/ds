package Stack;

import java.util.Stack;

public class NextSmallestFromRight {
    public static int[] NSFR(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int brr[] = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                brr[i]=-1;
            }
            else if(stack.peek()>=arr[i]){
                while(!stack.isEmpty()){
                    stack.pop();
                    if(stack.isEmpty()){
                        brr[i]=-1;
                        break;
                    }
                    else if(stack.peek()<arr[i]){
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
    public static void main(String args[]){
        int[] arr = {1,3,4,2};
        arr = NSFR(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
