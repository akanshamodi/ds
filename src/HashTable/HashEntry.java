package HashTable;

public class HashEntry {
    String key;
    int value;
    HashEntry next;
     HashEntry(int value,String key){
         this.key = key;
         this.value = value;
     }
}
