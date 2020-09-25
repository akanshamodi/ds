package HashTable;

public class ArrayHashing {
    public  static String getValue(int key){
        String s[] = {"I am akansha modi","I live in bhopal","bhopal is also called lake of the city"};
        if(key<=s.length){
            return s[key];
        }
        else{
            return "Invaild Key";
        }
    }
    public static void main(String args[]){
        System.out.println(getValue(1));

    }
}
