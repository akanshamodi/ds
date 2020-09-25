package Graph;

import java.util.Stack;

public class DetectCycle {
        public static boolean detectCycle(Graph g){
            if(dfs(g))
                return true;
            else
                return false;
        }

        public static boolean dfs(Graph g) {

            boolean visit[] = new boolean[g.vertices];
            for(int i=0;i<g.vertices;i++){
                if(!visit[i]){
                    if(dfS(g,i,visit))
                        return true;
                }
            }
            return false;
        }
        public static boolean dfS(Graph g, int source, boolean[] visit){

            Stack<Integer> s = new Stack<>();
            s.push(source);
            visit[source]=true;
            while(!s.isEmpty()){
                int current = s.pop();
                DoublyLinkedList<Integer>.Node temp =null;
                if( g.adjacencyList[current].headNode!=null)
                {
                    temp =  g.adjacencyList[current].headNode;
                    if(!visit[temp.data]){
                        s.push(temp.data);
                        visit[temp.data]=true;
                    }
                    else{
                        return true;
                    }
                }
            }
            return false;
        }
    }