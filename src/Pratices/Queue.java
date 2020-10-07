package Pratices;

public class Queue {

    int arr[];
    int front=0,rear=-1;

    Queue(int size){
        arr=new int[size];
    }

    private void enqueue(int i) {
        if(rear>=arr.length){
            System.out.println("Queue is full");
        }else {
            rear++;
            arr[rear]=i;
        }
    }


    private void dequeue() {
        if(front==-1 || front==rear){
            System.out.println("Queue is emptpy");
        }else {
            System.out.println(arr[front]);
            front++;
        }
    }

    private void fpeek() {
        if(front==-1 || front==rear){
            System.out.println("Queue is emptpy");
        }else {
            System.out.println(arr[front]);
            front++;
            //Integer.MAX_VALUE;
        }
    }

    private void rpeek() {
        if(front==-1 || front==rear){
            System.out.println("Queue is emptpy");
        }else {
            System.out.println(arr[front]);
            front++;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
    }


}
