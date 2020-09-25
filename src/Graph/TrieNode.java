package Graph;

public class TrieNode {
    TrieNode children[];
    Boolean isEndWord;
    public static int Alphabetical_size = 26;
    TrieNode(){
        this.children = new TrieNode[Alphabetical_size];
        this.isEndWord = false;
    }
    public void markAsLeaf(){
        this.isEndWord = true;
    }
    public void unMarkAsLeaf(){
        this.isEndWord = false;
    }

}
