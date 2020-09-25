package HashTable;

import java.util.ArrayList;

public class HashTable {
    ArrayList<HashEntry> bucket;
    int slot;
    int size;
    HashTable() {
        bucket = new ArrayList<HashEntry>();
        slot = 10;
        size = 0;
        for (int i = 0; i < slot; i++) {
            bucket.add(null);
        }
    }
        public int Size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % slot;
        //Check if index is negative
        if(index<0){
            index=(index + slot) % slot;
        }
        return index;
    }
    public void insertion(String key,int value){
        int b_index = getIndex(key);
        HashEntry head = bucket.get(b_index);
        while(head!=null){
            if(head.key.equals(value)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
       head = bucket.get(b_index);
        HashEntry temp = new HashEntry(value,key);
        temp.next = head;
        bucket.set(b_index,temp);
        if((1.0*size)/slot>=0.6){
            ArrayList<HashEntry> curr = bucket;
            bucket = new ArrayList<>();
            slot = slot*2;
            size = 0;
            for(int i=0;i<slot;i++){
                bucket.add(null);
            }
            for(HashEntry headNode : curr){
                while(headNode!=null) {
                    insertion(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    public int getValue(String key){
        int b_index = getIndex(key);
        HashEntry temp = bucket.get(b_index);
        while(temp!=null){
            if(temp.key.equals(key))
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }
    public int deletion(String key){
        int b_index = getIndex(key);
        HashEntry head = bucket.get(b_index);
        HashEntry pre = null;
        while(head!=null){
            if(head.key.equals(key)){
               break;
            }
            pre = head;
            head = head.next;
        }
        if(head == null)
            return 0;
        size--;
        if(pre!=null){
            pre.next = head.next;
        }
        else{
            bucket.set(b_index,head.next);
        }
        return head.value;
    }
}
