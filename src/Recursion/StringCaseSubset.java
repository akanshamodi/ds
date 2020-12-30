package Recursion;

public class StringCaseSubset {
    public static void main(String args[]){
        String s = "abc";
        String op = " ";
        CaseSubset(s,op);
    }
    public static void CaseSubset(String ip,String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 = op1 + Character.toString(ip.charAt(0));
        op2 = op2 + (Character.toString(ip.charAt(0)-32));
        ip = StringSubset.charRemoveAt(ip,0);
        CaseSubset(ip,op1);
        CaseSubset(ip,op2);
    }
    public static String charRemoveAt(String str, int p) {
        if(p >= str.length()){
            return " ";
        }
        return str.substring(0, p) + str.substring(p + 1);
    }
}
