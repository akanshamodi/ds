package Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void Reverse(Stack<Integer> s){
        if(s.empty() || s.size()==1  ){
            return;
        }
       int n= s.pop();
        Reverse(s);
        ReverseAStack.ReverseD(s,n);

        return;
    }
    public static void ReverseD(Stack<Integer> s,int n){
        if(s.empty()) {
            s.push(n);
            return;
        }
        int p= s.pop();
        ReverseD(s,n);
        s.push(p);
        return;
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        ReverseAStack.Reverse(s);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
