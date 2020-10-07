package Pratices.LL;

public class LLStack {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node head,tail;

    private  void push(Node node){
        if(head==null){
            head=node;
        }else {
            node.next=head;
            head=node;
        }
    }

    private  void pop(){
        if(head==null){
            return;
        }else {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        LLStack stack= new LLStack();
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.pop();

    }
}
