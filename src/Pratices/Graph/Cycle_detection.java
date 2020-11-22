package Pratices.Graph;

import java.util.ArrayList;
import java.util.List;

public class Cycle_detection {
    public static void main(String[] args) {
        List<Node> allnodes = new ArrayList<>();

        Node node1= new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        Node node5= new Node(5);

        node1.neighbours.add(node2);
        node1.neighbours.add(node3);

        node2.neighbours.add(node5);

        node4.neighbours.add(node2);

        node5.neighbours.add(node4);

        allnodes.add(node1);
        allnodes.add(node2);
        allnodes.add(node3);
        allnodes.add(node4);
        allnodes.add(node5);

        cycledetect(node1);
    }

    private static void cycledetect(Node node1) {

        if(node1.status==0){
            node1.status=1;
            List<Node> neighbours = node1.neighbours;
            for(Node node:neighbours){
                cycledetect(node);
            }
            node1.status=2;
        }else if(node1.status==1){
            System.out.println("cycle detected");
            return;
        }







    }
}
