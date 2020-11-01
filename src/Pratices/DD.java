package Pratices;

import java.util.ArrayList;
import java.util.List;

public class DD {

    static void dfs(int n, int cnt, List<Boolean> visted, ArrayList<ArrayList<Integer>> graph){
        visted.set(n,true);
        cnt++;
        for(Integer i:graph.get(n)){
            if(!visted.get(i))
                dfs(i,cnt,visted,graph);
        }
    }

    int sqr(int n){
        if(n==1)
            return 1;
        int ans = (int) Math.sqrt(n);
        if(ans*ans==n)return ans;
        else return ans+1;
    }

    int connectedSum(int graph_nodes,List<Integer>graph_from,List<Integer> graph_to){
        int n=graph_nodes;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n);
        for(int i=0;i<graph_from.size();i++) {
            ArrayList a = graph.get(graph_from.get(i) - 1);
            ArrayList b = graph.get(graph_to.get(i) - 1);
            if (a == null) {
                ArrayList<Integer> A = new ArrayList<>();
                A.add(graph_to.get(i) - 1);
                graph.set(graph_from.get(i) - 1, A);
            } else {
                a.add(graph_to.get(i) - 1);
                graph.set(graph_from.get(i) - 1, a);
            }
            if (b == null) {
                ArrayList<Integer> A = new ArrayList<>();
                A.add(graph_from.get(i) - 1);
                graph.set(graph_to.get(i) - 1, A);
            } else {
                b.add(graph_from.get(i) - 1);
                graph.set(graph_to.get(i) - 1, b);
            }
        }

            List<Boolean> vis= new ArrayList<>(n);

            int ans=0;
            for(int i=0;i<n;i++){
                if(!vis.get(i)){
                    int cnt=0;
                    dfs(i, cnt , vis, graph);

                    ans+= sqr(cnt);
                }
            }

         return ans;
        }



    public static void main(String[] args) {

        
    }
}
