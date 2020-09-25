package Graph;

public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    public int getIndex(char t){
        return t-'a';
    }
    public void insert(String Key){
        if(Key==null){
            System.out.println("Null key can not be inserted");
            return;
        }
        TrieNode currentNode = this.root;
        int index = 0;
        Key = Key.toLowerCase();
        for(int level=0;level<Key.length();level++){
            index = getIndex(Key.charAt(level));
            if(currentNode.children[index] == null){
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.markAsLeaf();
    }
    public Boolean search(String Key){
        if(Key == null){
            System.out.println("null value cannot be search");
            return false;
        }
        Key = Key.toLowerCase();
        int index=0;
        TrieNode currentNode =  this.root;
        for(int i=0;i<Key.length();i++){
            index = getIndex(Key.charAt(i));
            if(currentNode.children[index]==null){
                return false;
            }
            currentNode = currentNode.children[index];
        }
        if(currentNode.isEndWord){
            return true;
        }else {
            return false;
        }
    }
    public Boolean hasNoChildren(TrieNode currentNode){
        for(int i = 0;i < currentNode.children.length;i++) {
            if ((currentNode.children[i])!= null)
                return false;
        }
        return  true;
    }
    public Boolean deleteHelper(String Key, TrieNode currentNode, int length, int level){
        Boolean deleteSelf = false;
        if(level == length){
            if(hasNoChildren(currentNode)){
                currentNode=null;
                deleteSelf = true;
            }
            else{
                currentNode.unMarkAsLeaf();
                deleteSelf = false;
            }
        }else{
            TrieNode childNode = currentNode.children[getIndex(Key.charAt(level))];
            boolean childDeleted = deleteHelper(Key, childNode, length, level + 1);
            if (childDeleted)
            {
                currentNode.children[getIndex(Key.charAt(level))] = null;
                if (currentNode.isEndWord){
                    deleteSelf = false;
                }
                else if (!hasNoChildren(currentNode)){
                    deleteSelf = false;
                }
                //Else we can delete currentNode
                else{
                    currentNode = null;
                    deleteSelf = true;
                }
            }
            else
            {
                deleteSelf = false;
            }
        }
        return deleteSelf;
    }

    //Function to delete given key from Trie
    public void delete(String key){
        key = key.toLowerCase();
        if ((root == null) || (key == null)){
            System.out.println("Null key or Empty trie error");
            return;
        }
        deleteHelper(key, root, key.length(), 0);
    }
    public static int totalWords(TrieNode root){
        // the worst-case running time is O(d^h)
        //where d is the size of the alphabet (26 for English), and h is the length of the longest word in the dictionary.
        int s=0;
        if(root.isEndWord)
            s++;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null)
                s += totalWords(root.children[i]);
        }

        return s;
    }
}


