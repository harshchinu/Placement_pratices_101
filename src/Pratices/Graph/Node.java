package Pratices.Graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int status; //0:unvisited 1:visiting 2:visited;
    int data;
    List<Node> neighbours;


    Node(int data){
        status=0;
        this.data=data;
        neighbours=new ArrayList<>();
    }
}
