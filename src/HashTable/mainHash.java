package HashTable;

public class mainHash {
    public static void main(String args[]){
        HashTable hash = new HashTable();
        System.out.println(hash.Size());
        hash.insertion("I",1);
        hash.insertion("am",2);
        hash.insertion("akansha",3);
        hash.insertion("modi",4);
        System.out.println(hash.Size());
        System.out.println(hash.deletion("modi"));
        System.out.println(hash.Size());
        System.out.println(hash.getValue("am"));
    }
}
