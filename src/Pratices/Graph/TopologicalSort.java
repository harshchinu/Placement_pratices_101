package Pratices.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {

        List<BGraph.Node> allnodes = new ArrayList<>();

        BGraph.Node node1=new BGraph.Node(1);
        BGraph.Node node2=new BGraph.Node(2);
        BGraph.Node node3=new BGraph.Node(3);
        BGraph.Node node4=new BGraph.Node(4);
        BGraph.Node node5=new BGraph.Node(5);

        node1.neighbours.add(node2);
        node1.neighbours.add(node4);

        node2.neighbours.add(node4);
        node2.neighbours.add(node3);
        node2.neighbours.add(node5);

        node3.neighbours.add(node5);


        allnodes.add(node1);
        allnodes.add(node2);
        allnodes.add(node3);
        allnodes.add(node4);
        allnodes.add(node5);

        HashMap<BGraph.Node,Boolean> visited = new HashMap<>();

        for(BGraph.Node node : allnodes){
            visited.put(node,false);
        }

        Stack<BGraph.Node> stack = new Stack<>();
        topological(allnodes,stack,visited,node1);
        System.out.println(stack.toString());
        System.out.println(stack.peek());

    }

    private static void topological(List<BGraph.Node> allnodes, Stack<BGraph.Node> stack, HashMap<BGraph.Node, Boolean> visited, BGraph.Node node1) {

        if(!visited.get(node1)){
            stack.push(node1);
            visited.put(node1,true);
            List<BGraph.Node> neighnbours = node1.neighbours;

            for(BGraph.Node node: neighnbours){
                topological(allnodes,stack,visited,node);
            }
        }








    }
}
