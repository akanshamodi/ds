package Recursion;

public class PrintNTo1 {
    public static void printN(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            printN(--n);
        }
    }
    public static void main(String args[]){
        printN(8);
    }
}
