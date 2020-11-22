package Pratices.Graph;

import Pratices.Arrays.Array;

import java.util.*;

public class BGraph {

    static class Node{
        List<Node> neighbours;
        int data;

        Node(int data){
            this.data=data;
            neighbours=new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }


    public static void main(String[] args) {

        List<Node> allnodes = new ArrayList<>();

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);

        node1.neighbours.add(node2);
        node1.neighbours.add(node3);

        node2.neighbours.add(node4);

        node3.neighbours.add(node4);
        node3.neighbours.add(node5);
        node4.neighbours.add(node6);

        node5.neighbours.add(node6);

        allnodes.add(node1);
        allnodes.add(node2);
        allnodes.add(node3);
        allnodes.add(node4);
        allnodes.add(node5);
        allnodes.add(node6);

        HashMap<Node,Boolean> visited = new HashMap<>();

        for(Node node : allnodes){
            visited.put(node,false);
        }


        dfs(allnodes,visited,node1);
        System.out.println();
        for(Node node : allnodes){
            visited.put(node,false);
        }

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<6;i++){
            List a=graph.get(i);
            if(a==null){

            }
        }




        bfs(allnodes,visited,node1);

    }

    private static void bfs(List<Node> allnodes, HashMap<Node, Boolean> visited, Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
       while (!queue.isEmpty()){
           Node node2=queue.remove();
           if(!visited.get(node2)) {
               System.out.print(node2.data + " ");
               visited.put(node2,true);
               List<Node> neighbours = node2.neighbours;
               for (Node nodes : neighbours) {
                   queue.add(nodes);
               }
           }

       }
    }

    private static void dfs(List<Node> allnodes, HashMap<Node, Boolean> visited, Node node) {

        if(!visited.get(node)){
            System.out.print(node.data+" ");
            visited.put(node,true);
            List<Node> neighbours=node.neighbours;
            for(Node node1:neighbours){
                dfs(allnodes,visited,node1);
            }
        }


    }
}
