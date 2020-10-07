package Pratices.Graph;

import java.util.*;

public class Krushal {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph();
        graph.addEdge(0, 1,true, 1);
        graph.addEdge(0, 2,true, 1);
        graph.addEdge(1, 2, true,2);
        graph.addEdge(1, 3, true,2);
        graph.addEdge(2, 3, true,4);
        graph.addEdge(3, 4, true,2);
        graph.addEdge(4, 5, true,6);

        List<Edge<Integer>> result =
                krushalmst(graph);
        int sum=0;
        for (Edge<Integer> edge : result) {
            System.out.println(edge.getSource() + " " + edge.getDestination());
            sum+=edge.getWeight();
        }

        System.out.println(sum);
    }

    private static List<Edge<Integer>> krushalmst(Graph<Integer> graph) {

        List<Edge<Integer>> alledges = graph.allEdges;

        Collections.sort(alledges, new Comparator<Edge<Integer>>() {
            @Override
            public int compare(Edge<Integer> o1, Edge<Integer> o2) {
                if(o1.getWeight()<=o2.getWeight()){
                    return -1;
                }else if(o1.getWeight()>o2.getWeight()){
                    return 1;
                }
                return 0;
            }
        });
    /*    PriorityQueue<Edge<Integer>> priorityQueue = new PriorityQueue<>(graph.allEdges.size(), new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.getWeight()<o2.getWeight()){
                    return 1;
                }else if(o1.getWeight()>o2.getWeight()){
                    return -1;
                }
                return 0;
            }
        });*/

        HashSet<Integer> hashSet = new HashSet<>();

        DisjointSet<Integer> disjointSet = new DisjointSet();

        for (Integer vertex : graph.map.keySet()) {
            disjointSet.MakeSet(vertex);
        }

        List<Edge<Integer>> result = new ArrayList<>();

        //Iterator iterator = priorityQueue.iterator();

        for (Edge<Integer> edge:alledges){

            Integer root1 = disjointSet.findSet((Integer) edge.getSource());
            Integer root2 = disjointSet.findSet((Integer) edge.getDestination());

            if (root1 == root2) {
                continue;
            } else {
                //if vertices are in different set then add the edge to result and union these two sets into one
                result.add(edge);
                disjointSet.union((int)edge.getSource(), (int)edge.getDestination());
            }
        }

        return result;

    }
}
