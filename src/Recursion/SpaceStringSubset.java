package Recursion;

public class SpaceStringSubset {
    public static void main(String args[]){
        String ip = "abc";
        String op = " ";
        op = Character.toString(ip.charAt(0));
        ip = SpaceStringSubset.charRemoveAt(ip,0);
        Subset(ip,op);

    }
    public static void Subset(String ip , String op){
       if(ip.length()==0){
           System.out.println(op);
           return;
       }
       String op1 = op;
       String op2 = op;
       op1 = op1 + " ";
       op1 = op1 + Character.toString(ip.charAt(0));
       op2 = op2 + Character.toString(ip.charAt(0));
       ip = SpaceStringSubset.charRemoveAt(ip,0);
       Subset(ip,op1);
       Subset(ip,op2);
       return;

    }
    public static String charRemoveAt(String str, int p) {
        if(p >= str.length()){
            return " ";
        }
        return str.substring(0, p) + str.substring(p + 1);
    }
}
