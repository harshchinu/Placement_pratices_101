package Pratices.Dunzopreparation;

import Pratices.Graph.Pair;

public class Sort012LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    Node tail;

    public static void main(String[] args) {

        Sort012LinkedList sort012LinkedList = new Sort012LinkedList();
        sort012LinkedList.add(1);
        sort012LinkedList.add(0);
        sort012LinkedList.add(2);
        sort012LinkedList.add(0);
        sort012LinkedList.add(1);
        sort012LinkedList.add(0);
        sort012LinkedList.add(2);
        sort012LinkedList.add(1);

        sort012LinkedList.printLL();
        System.out.println();

        sort012LinkedList.sortLL();
        sort012LinkedList.printLL();

    }

    private void sortLL() {
        Node temp=head;
       while(temp.next!=null){
           if(temp.data==0){
               temp.data=temp.next.data;
               temp.next=temp.next;
               Node node=new Node(0);
               node.next=head;
               head=node;
           }else if(temp.data==2){
               temp.data=temp.next.data;
               temp.next=temp.next;
               Node node=new Node(2);
               tail.next=node;
               tail=node;
           }


            temp=temp.next;

       }


    }

    private void printLL() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }


    private void add(int i) {
        Node node= new Node(i);
        if(head==null){
            tail= node;
            head=node;
        }else {
            tail.next=node;
            tail=node;
        }
    }

}
