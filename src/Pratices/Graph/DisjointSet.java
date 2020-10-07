package Pratices.Graph;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet<T> {

    Map<T,Node<T>> sets = new HashMap<>();

    class Node<T>{
        T data;
        int rank;
        Node parent;
    }

    public void MakeSet(T data){
        Node node = new Node();
        node.data=data;
        node.rank=0;
        node.parent=node;
        sets.put(data,node);
    }

    public void union(T data1,T data2){
        Node node1 = sets.get(data1);
        Node node2 = sets.get(data2);


        Node parent1=findSet(node1);
        Node parent2=findSet(node2);

        if(parent1.data.equals(parent2.data))
            return;

        if(parent1.rank>=parent2.rank){
            parent1.rank=(parent1.rank==parent2.rank)?parent1.rank+1:parent1.rank;
            parent2.parent=parent1;
        }else {
            parent1.parent=parent2;
        }


    }

    public T findSet(T data){
        return (T) findSet(sets.get(data)).data;
    }

    public Node findSet(Node node1) {
            Node parent = node1.parent;

            if(parent==node1){
                return parent;
            }
            node1.parent=findSet(node1.parent);
            return node1.parent;
    }
}
