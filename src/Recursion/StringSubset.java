package Recursion;

public class StringSubset {
    public static void Solve(String ip,String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1=op;
        String op2 =op;
        op2 = op2 + Character.toString(ip.charAt(0));
        ip = StringSubset.charRemoveAt(ip,0);
        Solve(ip,op1);
        Solve(ip,op2);


    }
    public static String charRemoveAt(String str, int p) {
        if(p >= str.length()){
            return " ";
        }
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static void main(String args[]){
        String s = "abc";
        String op = " ";
        Solve(s,op);
    }
}
