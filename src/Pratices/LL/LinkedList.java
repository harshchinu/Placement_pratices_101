package Pratices.LL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LinkedList {

    static class Node<T>{
        static int Nodenumber=1;
        T data;
        int Nodenumberr=0;
        Node<Integer> next;


        Node(T data){
            this.data=data;
           this.Nodenumberr=Nodenumber;
           Nodenumber++;
        }

        Node(T data,int nodenumber){
            this.data=data;
            this.Nodenumberr=nodenumber;
            Nodenumber=nodenumber;
            }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Node's Data is "+data);
            stringBuilder.append("\n");
            stringBuilder.append("Node Number is "+Nodenumberr);
            return stringBuilder.toString();
        }
    }

    Node<Integer> head;
    Node<Integer> tail;
    private void insert(Node<Integer> integerNode) {
        if(head==null){
            head=tail=integerNode;
        }else {
            tail.next=integerNode;
            tail=integerNode;
        }
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Node<Integer> node = new Node<>(8);
        //Node<Integer> node1=new Node<>(4).next=node;
        linkedList.insert(new Node<Integer>(3));
        linkedList.insert(new Node<Integer>(5));
        linkedList.insert(node);
        linkedList.insert(new Node<>(5));
        linkedList.insert(new Node<>(10));
        linkedList.insert(new Node<>(2));
        linkedList.insert(new Node<>(1));



       // linkedList.recursiveprint(linkedList.head,0);
      //  linkedList.countingNode(linkedList.head);
        //linkedList.sumofalliterative(linkedList.head);
       // linkedList.recursesun(linkedList.head,0);

        //linkedList.mamximum(linkedList.head);
        //linkedList.maximumrecursion(linkedList.head,Integer.MIN_VALUE);

        //linkedList.searching(linkedList.head,5);

      //  linkedList.head=linkedList.improvisedsearching(linkedList.head,1);


      //  linkedList.insertat(linkedList.head,1,1);

       /* linkedList.head=reversepointer(linkedList.head);
        linkedList.print(linkedList.head);*/
       // linkedList.detectloop(linkedList.head);

        /*removeveduplicatewithbuffer(linkedList.head);
        linkedList.print(linkedList.head);*/
        /*removeduplicatedwithoutextrabufer(linkedList.head);
        System.out.println();*/

//        linkedList.deletethatnode(linkedList.head,node);
        linkedList.head=linkedList.paration(linkedList.head,5);
        linkedList.print(linkedList.head);

        

    }

    private Node<Integer> paration(Node<Integer> head, int i) {
        List<Integer> smaller= new ArrayList<>();
        List<Integer> bigger=new ArrayList<>();

        Node current = head;
        while (current!=null){
            if((int)current.data<i){
                smaller.add((int)current.data);
            }

            if((int)current.data>=i){
                bigger.add((int)current.data);
            }

            current=current.next;
        }

        current=head;
        int k=0,j=0;
        while (current!=null){
           while (k!=smaller.size()){
               current.data=smaller.get(k);
               k++;
               current=current.next;
           }
            while (j!=bigger.size() && current!=null){
                current.data=bigger.get(j);
                j++;
                current=current.next;
            }

        }

        return head;
    }

    private void deletethatnode(Node<Integer> head, Node<Integer> node) {
        if(head==null || node==null){
            return;
        }

        node.data=node.next.data;
        node.next=node.next.next;

    }

    private static void removeduplicatedwithoutextrabufer(Node<Integer> head) {
        Node currentElement = head,runner=null,previous=null;

        while (currentElement!=null){
            runner=currentElement;previous=null;
            while (runner.next!=null){
                if(currentElement.data==runner.next.data){
                    runner.next=runner.next.next;
                }else
                runner=runner.next;
            }




            currentElement=currentElement.next;
        }



    }

    private static void removeveduplicatewithbuffer(Node<Integer> head) {

        HashSet<Integer> hashSet = new HashSet<>();

        Node current=head,prev=head;
        while (current!=null){

            if(hashSet.contains(current.data)){
                prev.next=current.next;
            }else {
                hashSet.add((Integer) current.data);
            }
            prev=current;
            current=current.next;
        }
    }

    private void detectloop(Node<Integer> head) {

        Node fast = head,slow=head;

        while (fast!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                System.out.println("Loop Detected");
                break;
            }
        }
    }

    private static Node<Integer> reversepointer(Node<Integer> head) {
        Node<Integer> current=head;
        Node<Integer> previous=null;
        Node<Integer> next=head;
        while (next!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;


        }
        return previous;
    }

    private void insertat(Node<Integer> head, int postion, int value) {
        if(head==null){
            return;
        }

        if(postion==tail.Nodenumberr){
            Node<Integer> newnode = new Node<Integer>(value,tail.Nodenumberr+1);
            tail.next=newnode;
            tail=newnode;
        }else if(postion==head.Nodenumberr){
            Node<Integer> newnode = new Node<Integer>(value);
            newnode.next=head;
            head=newnode;
        }else {
            int nodecount=1;
            Node<Integer> current=head;
            while (current.next!=null || nodecount!=postion){
                current=current.next;
                nodecount++;
            }
            Node<Integer> newnode = new Node<Integer>(value);
            newnode.next=current.next;
            current.next=newnode;

        }
    }

    private Node<Integer> improvisedsearching(Node<Integer> head, int i) {
        Node<Integer> current=head;

        while (current.next!=null){
            if(current.next.data ==i){
                Node<Integer> temp=current.next;
                current.next=temp.next;
                temp.next=head;
                head=temp;
            }
            current=current.next;
        }
        return head;
    }

    private void searching(Node<Integer> head, int i) {
        Node<Integer> current=head;
        while (current!=null){
            if(current.data ==i){
                System.out.println(head.toString());
                break;
            }

            current=current.next;
        }

    }

    private void maximumrecursion(Node<Integer> head, int currentMax) {
        if(head==null){
            System.out.println(currentMax);
            return;
        }

        // System.out.println(head.data);
        if(head.data >currentMax){
            currentMax= head.data;
        }
        maximumrecursion(head.next, currentMax);
    }

    private void mamximum(Node<Integer> head) {
        if(head==null){
            return;
        }

        Node<Integer> current=head;
        Integer max=Integer.MIN_VALUE;
        while (current!=null){
            if(current.data >max){
                max= current.data;
            }
            current=current.next;
        }
        System.out.println(max);
    }

    private void recursesun(Node<Integer> head, int sum) {
        if(head==null){
            System.out.println(sum);
            return;
        }

       // System.out.println(head.data);
        sum+= head.data;
        recursesun(head.next, sum);
    }

    private void sumofalliterative(Node<Integer> head) {
        int sum=0;
        Node<Integer> current=head;

        while (current!=null){
            sum=sum+ current.data;
            current=current.next;;
        }
        System.out.println(sum);
    }

    private void countingNode(Node<Integer> head) {
        int count=0;
        Node<Integer> current=head;
        System.out.print("head=>");
        while (current!=null){
            System.out.print(current.data+"=>");
            current=current.next;
            count++;
        }
        System.out.print("null");
        System.out.println();
        System.out.println(count);
    }

    private void recursiveprint(Node<Integer> head, int i) {
        if(head==null){
            System.out.println(i);
            return;
        }

        System.out.println(head.data);
        recursiveprint(head.next, i+1);
    }


    private void print(Node<Integer> head) {
        if(head==null){
            return;
        }
        Node<Integer> current=head;
        System.out.print("head=>");
        while (current!=null){
            System.out.print(current.data+"=>");
            current=current.next;
        }
        System.out.print("null");
    }


}
