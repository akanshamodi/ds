package Recursion;

import java.util.Stack;

public class StackMiddleElement {
    public static void DeleteMiddle(Stack<Integer> s,int mid){
        if(mid==1){
            s.pop();
            return;
        }
        int n = s.pop();
        DeleteMiddle(s,mid-1);
        s.push(n);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        int k = (s.size()/2)+1;
        StackMiddleElement.DeleteMiddle(s,k);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
