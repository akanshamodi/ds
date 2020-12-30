package Recursion;

public class PrintToN2 {
    public static void print(int n){
        if(n==1){
            return;
        }
        else{
            print(--n);
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        print(8);
    }
}
