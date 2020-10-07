package Pratices.Graph;

import java.util.*;


public class PRIMS {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        graph.addEdge(0, 1,true, 1);
        graph.addEdge(0, 2,true, 1);
        graph.addEdge(1, 2, true,2);
        graph.addEdge(1, 3, true,2);
        graph.addEdge(2, 3, true,4);
        graph.addEdge(3, 4, true,2);
        graph.addEdge(4, 5, true,6);

        prismST(graph,graph.map.size());
    }

    static class ResultSet {
        int parent;
        int weight;
    }

    private static void prismST(Graph<Integer> g, int size) {

        HashMap<Integer, Boolean> visited = new HashMap<>();
        for (Integer i : g.map.keySet()) {
            visited.put(i, false);
        }
        ResultSet[] resultSet = new ResultSet[visited.size()];
        int[] key = new int[size];

        for (int i = 0; i <size ; i++) {
            key[i] = Integer.MAX_VALUE;
            resultSet[i] = new ResultSet();
        }
        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>(size, (o1, o2) -> {
           if(o1.p1<o2.p1){
               return 1;
           }else if(o1.p1>o2.p1){
               return -1;
           }
           return 0;
        });

       /* key[0] = 0;
      //  Pair<Integer,Integer> p0 = new Pair<>(key[0],0);*/

        List la= g.map.get(0);
        for(int i=0;i<la.size();i++){
            Edge edge = (Edge) la.get(i);
            Pair<Integer,Integer> p0 = new Pair<Integer, Integer>(edge.getWeight(), (Integer) edge.getSource());
            pq.offer(p0);
        }

        resultSet[0] = new ResultSet();
        resultSet[0].parent = -1;
        System.out.println(pq.size());
        while (!pq.isEmpty()) {
            Pair<Integer,Integer> extractepair=pq.poll();
            int extractedvertices = extractepair.getP2();
            visited.put(extractedvertices, true);

            List l = g.map.get(extractedvertices);

            for (int i = 0; i < l.size(); i++) {
                Edge edge = (Edge) l.get(i);

                if (visited.get(edge.destination)) {
                    continue;
                }
                    int destination = (int) edge.getDestination();
                    int newKey = edge.getWeight();

                    if (key[destination] > newKey) {
                        Pair<Integer,Integer> p = new Pair<>(newKey,destination);
                        pq.offer(p);
                        resultSet[destination].parent = extractedvertices;
                        resultSet[destination].weight = newKey;
                        key[destination] = newKey;
                    }
                }
            }
        printMST(resultSet,g);
        }



    private static void printMST(ResultSet[] resultSet, Graph<Integer> g) {

        int total_min_weight = 0;
        System.out.println("Minimum Spanning Tree: ");
        for (int i = 1; i <g.map.size() ; i++) {
            System.out.println("Edge: " + i + " - " + resultSet[i].parent +
                    " key: " + resultSet[i].weight);
            total_min_weight += resultSet[i].weight;
        }
        System.out.println("Total minimum key: " + total_min_weight);
    }

}
