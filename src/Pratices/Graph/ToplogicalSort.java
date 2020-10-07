package Pratices.Graph;

import java.util.*;

public class ToplogicalSort {
    public static void main(String[] args) {
        Graph<Character> graph = new Graph<>();

        /*"wrt",
  "wrf",
  "er",
  "ett",
  "rftt*/

        int input=5;
        Scanner sc = new Scanner(System.in);
        while (input-->0){
            String s=sc.nextLine();
            for(int i=0;i<s.length()-1;i++){
                graph.addEdge(s.charAt(i),s.charAt(i+1),false);
            }
        }



        HashMap<Character,Boolean> visited = new HashMap<>();
        for(Character i:graph.map.keySet()){
            visited.put(i,false);
        }
        Stack<Character> inbuilderorder = new Stack<>();
        for(Character c:graph.map.keySet()){
            topologiclal(c,visited,inbuilderorder,graph);
        }

       while (!inbuilderorder.isEmpty()){
           System.out.print(inbuilderorder.pop()+" ");
       }
    }

    private static void topologiclal(Character c, HashMap<Character, Boolean> visited, Stack<Character> inbuilderorder, Graph<Character> graph) {
        if(visited.get(c)==false) {
            visited.put(c, true);
            List l = graph.map.get(c);
            for (int i = 0; i < l.size(); i++) {
                Edge edge = (Edge) l.get(i);
                if (visited.get(edge.getDestination()) == false) {
                    topologiclal((Character) edge.getDestination(), visited, inbuilderorder, graph);
                }
            }
            inbuilderorder.push(c);
        }

    }
}
