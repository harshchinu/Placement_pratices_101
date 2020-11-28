package Pratices.Graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    int status; //0:unvisited 1:visiting 2:visited;
    T data;
    List<Node> neighbours;


    Node(T data){
        status=0;
        this.data=data;
        neighbours=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
