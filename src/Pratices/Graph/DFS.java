package Pratices.Graph;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        Graph<Integer> g  =new Graph<>();
        g.addEdge(1, 0,false);
        g.addEdge(0, 2,false);
        g.addEdge(2, 1,false);
        g.addEdge(0, 3,false);
        g.addEdge(1, 4,false);

        //dfs(graph,1);
        //Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(Integer i:g.map.keySet()){
            visited.put(i,false);
        }

        dfsRecursive(g,0,visited);

        System.out.println();

        dfs(g,0);

        System.out.println();

        bfs(g,1);

    }

    private static void dfsRecursive(Graph<Integer> graph, int a, HashMap<Integer, Boolean> visited) {
        if(visited.get(a)==false){
            System.out.println(a);
            visited.put(a,true);
            List l=graph.map.get(a);
            for(int i=0;i<l.size();i++){
              Edge edge = (Edge) l.get(i);
              if(visited.get(edge.getDestination())==false){
                  dfsRecursive(graph, (Integer) edge.getDestination(),visited);
              }
            }

        }

    }

    private static void bfs(Graph<Integer> graph, int a) {
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(Integer i:graph.map.keySet()){
            visited.put(i,false);
        }

        queue.add(a);
        while (!queue.isEmpty()){
            a=queue.remove();
            if(visited.get(a)==false){
                System.out.println(a);
                visited.put(a,true);
                List l=graph.map.get(a);
                for(int i=0;i<l.size();i++){
                    Edge edge = (Edge) l.get(i);
                    if(visited.get(edge.getDestination())==false){
                        queue.add((Integer) edge.getDestination());
                    }
                }
            }
        }
    }

    private static void dfs(Graph<Integer> graph, int a) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(Integer i:graph.map.keySet()){
            visited.put(i,false);
        }

        stack.add(a);
        while (!stack.isEmpty()){
            a=stack.pop();
            if(visited.get(a)==false){
                System.out.println(a);
                visited.put(a,true);
                List l=graph.map.get(a);
                for(int i=0;i<l.size();i++){
                    Edge edge = (Edge) l.get(i);
                    if(visited.get(edge.getDestination())==false){
                        stack.push((Integer) edge.getDestination());
                    }
                }
            }
        }
    }


}

/*1
2
0
3

1
2
3
0*/