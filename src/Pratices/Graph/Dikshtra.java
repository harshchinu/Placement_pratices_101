package Pratices.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Dikshtra {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph();
        graph.addEdge(0, 1,false, 4);
        graph.addEdge(0, 2, false,3);
        graph.addEdge(1, 2, false,1);
        graph.addEdge(1, 3, false,2);
        graph.addEdge(2, 3, false,4);
        graph.addEdge(3, 4, false,2);
        graph.addEdge(4, 5, false,6);
         shortestPath(graph, 0);
    }

    private static void shortestPath(Graph<Integer> g, int a) {

        Map<Integer,Integer> distance = new HashMap<>();
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for (Integer i : g.map.keySet()) {
            visited.put(i, false);
            distance.put(i,Integer.MAX_VALUE);
        }

        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>((o1, o2) -> {
            if(o1.p1<o2.p1){
                return 1;
            }else if(o1.p1>o2.p1){
                return -1;
            }
            return 0;
        });

        distance.put(a, 0);
        Pair<Integer,Integer> p0 = new Pair<Integer, Integer>(distance.get(a),0);
        pq.offer(p0);
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> extractepair = pq.poll();
            int extractedvertices = extractepair.getP2();
            if (!visited.get(extractedvertices)) {
                visited.put(extractedvertices, true);

                List l = g.map.get(extractedvertices);
                for (int i = 0; i < l.size(); i++) {
                    Edge edge = (Edge) l.get(i);

                    if (visited.get(edge.destination)) {
                        continue;
                    }

                    int newKey = distance.get(extractedvertices) + edge.getWeight();
                    int current = distance.get(edge.getDestination());
                    if (current > newKey) {
                        Pair<Integer, Integer> p = new Pair<>(newKey, (int)edge.getDestination());
                        pq.offer(p);
                        distance.put((int)edge.getDestination(), newKey);
                    }
                }
            }
        }
        printDkijstar(distance,g,a);
    }

    private static void printDkijstar(Map<Integer, Integer> distance, Graph<Integer> g, int a) {
        for (int i = 0; i <g.map.size() ; i++) {
            System.out.println("Source Vertex: " + a + " to vertex " +   + i +
                    " distance: " + distance.get(i));
        }

    }

}
