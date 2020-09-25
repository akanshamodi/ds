package Graph;

import java.util.Stack;
public class ChechDfs {
        //Depth First Traversal of Graph g
        public static String dfs(Graph g) {
            String result = "";
            boolean visit[] = new boolean[g.vertices];
            for(int i=0;i<g.vertices;i++){
                if(!visit[i]){
                    result = result + dfS(g,i,visit);
                }
            }

            return result;
        }
        public static String dfS(Graph g, int source, boolean[] visit){
            String result = "";
            Stack<Integer> s = new Stack<>();
            s.push(source);
            visit[source]=true;
            while(!s.isEmpty()){
                int current = s.pop();
                result = result + String.valueOf(current);
                DoublyLinkedList<Integer>.Node temp =null;
                if( g.adjacencyList[current].headNode!=null)
                {
                    temp =  g.adjacencyList[current].headNode;
                    if(!visit[temp.data]){
                        s.push(temp.data);
                        visit[temp.data]=true;
                    }
                }
            }
            return result;
        }
    }

