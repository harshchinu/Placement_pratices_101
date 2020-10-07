package Pratices;

public class Stack {

    int size;
    int top=-1;
    int arr[];

    Stack(int size){
        arr=new int[size];
    }

    private void push(int value){

        if(top>=arr.length){
            System.out.println("Stack overflow");
            return;
        }else {
            top++;
            arr[top]=value;
        }
    }

    private void peek(){
        System.out.println(arr[top]);
    }

    private void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }else {
            System.out.println(arr[top]);
            top--;
        }
    }

    private void isStackempty(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
    }


    public static void main(String[] args) {
      Stack stack = new Stack(4);
      //stack.isStackempty();
      stack.push(1);
      stack.isStackempty();
      stack.peek();
      stack.push(2);
      stack.pop();
      stack.peek();

    }
}
