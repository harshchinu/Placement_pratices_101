import java.util.HashSet;
import java.util.Stack;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
    Node head=null;
    Node tail=null;


    public static void main(String[] args) {

        //Node node=new Node(1);

        //linkedList.createLL(new Node(6));
       // linkedList.reverse();


        //linkedList.head=linkedList.reverseingroup(linkedList.head,4);

        Node node = new Node(15);
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(new Node(3));
        linkedList.createLL(new Node(6));
        linkedList.createLL(new Node(9));
        linkedList.createLL(node);
        linkedList.createLL(new Node(30));

        LinkedList linkedList1 = new LinkedList();
        linkedList1.createLL(new Node(10,node));

     /*   linkedList.printLL(linkedList.head);
        linkedList1.printLL(linkedList1.head);*/

        int c=linkedList.insertionPoint(linkedList.head,linkedList1.head);
        System.out.println(c);
      /*  linkedList.loopremove(linkedList.head);
        linkedList.printLL(linkedList.head);*/


    }

    private int insertionPoint(Node head, Node head1) {
        Stack<Node> stack = new Stack<>();
        Stack<Node> stack1= new Stack<>();
        while (head!=null){
            stack.add(head);
           head=head.next;
        }

        while (head1!=null){
            stack1.add(head1);
            head1=head1.next;
        }

        Node temp = null;
        while (stack.empty()!=true && stack1.empty()!=true){
            if(stack.peek()==stack1.peek()){
                temp=stack.peek();
                //System.out.println(temp.data);
            }
            stack.pop();
            stack1.pop();
        }
        return temp.data;
    }

    private void loopremove(Node head) {
        HashSet<Node> hashSet = new HashSet<>();

        while (head!=null){
            if (hashSet.contains(head.next)){
                hashSet.add(head);
                head.next=null;

            }else {
                hashSet.add(head);

            }
            head=head.next;
        }
    }

    private Node reverseingroup(Node head, int i) {
        int count=0;
        Node current=head,prev=null,next = null;

        while (current!=null && count<i){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }



        if(next!=null){
            head.next=reverseingroup(next,i);
        }


        return prev;

    }

    private void reverse() {
       Node current=head,prev=null,next;
       while (current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
    }

    private void printLL(Node head) {

        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    private void createLL(Node node) {
        if(head==null){
            head=tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
    }


}
