package Pratices.LL;

import Pratices.Graph.Pair;

public class LinkedList {


    static class  Node<T> {
        Node next;
        T data;

        Node(T data){
            this.data=data;
        }
    }

    Node head;
    Node tail;

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(new Node<Integer>(1));
        linkedList.insert(new Node<Integer>(0));
        linkedList.insert(new Node<Integer>(2));
        linkedList.insert(new Node<Integer>(0));
        linkedList.insert(new Node<Integer>(1));
        linkedList.insert(new Node<Integer>(0));

        linkedList.insert(new Node<Integer>(2));
        linkedList.insert(new Node<Integer>(1));



        //linkedList.printLL(linkedList.head);
      //  linkedList.getN(5,linkedList.head);

        linkedList.sort0and1and2(linkedList.head);
        linkedList.printLL(linkedList.head);
    }

    private void sort0and1and2(Node head) {
        Node node = head;
        Node temp;
        while (node.next!=null){
            if((int)node.next.data==0){
                temp=node.next;
                node.next=temp.next;
                temp.next=head;
                head=temp;
            }else if((int)node.next.data==2){
                temp=node.next;
                node.next=temp.next;
                temp.next=tail;
                tail=temp;
            }
            node=node.next;
        }

        
    }

    private void getN(int n, Node head) {
        Node node = head;
        for(int i=0;i<n-1;i++) {
            if (node != null) {
                node = node.next;
            }
        }
        System.out.println(node.data);
    }

    private void printLL(Node head) {
        Node node =head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    private void insert(Node<Integer> integerNode) {
        if(head==null){
            head=integerNode;
            tail=integerNode;
        }else {
            tail.next=integerNode;
            tail=integerNode;
        }
    }
}
