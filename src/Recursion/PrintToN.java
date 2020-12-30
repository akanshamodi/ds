package Recursion;

public class PrintToN {
    static int n = 1;

    public static void print(int N){
      if(N>=n) {
          System.out.println(n);
          n++;
      }
      else
          return;

         print(N);
    }
    public static void main(String args[]){
        print(12);
    }
}
