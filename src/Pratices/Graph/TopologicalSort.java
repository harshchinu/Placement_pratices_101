package Pratices.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {

        List<Node<Character>> allnodes = new ArrayList<>();

       Node nodeA = new Node('A');
       Node nodeB = new Node('B');
       Node nodeC = new Node('C');
       Node nodeD = new Node('D');
       Node nodeE = new Node('E');
       Node nodeF= new Node('F');
       Node nodeG= new Node('G');

       nodeA.neighbours.add(nodeC);
       nodeB.neighbours.add(nodeC);
       nodeB.neighbours.add(nodeD);

       nodeC.neighbours.add(nodeE);

       nodeD.neighbours.add(nodeF);

       nodeE.neighbours.add(nodeF);

       nodeF.neighbours.add(nodeG);

       allnodes.add(nodeA);
       allnodes.add(nodeB);
       allnodes.add(nodeC);
       allnodes.add(nodeD);
       allnodes.add(nodeE);
       allnodes.add(nodeF);
       allnodes.add(nodeG);



        Stack<Node> stack = new Stack<>();
        for(Node node:allnodes) {
            ToppologicalSort(node, stack);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");

        }
    }

    private static void ToppologicalSort(Node nodeA, Stack<Node> stack) {
        if(nodeA.status==0){
            List<Node> list = nodeA.neighbours;
            nodeA.status=1;
            for(Node node:list){
                if(node.status==0)
                ToppologicalSort(node,stack);

            }
            stack.add(nodeA);
            nodeA.status=2;


        }



    }


}
