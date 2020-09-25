package Graph;

public class MainTrie {
    public static  void main(String args[]){
        Trie t = new Trie();
        String key[] = {"Orange","Owl"};
        for(int i=0;i< key.length;i++) {
            t.insert(key[i]);
        }
        System.out.println(t.search("Apple"));
     //   t.delete("Orange");
        System.out.println(t.totalWords(t.root));
    }
}
