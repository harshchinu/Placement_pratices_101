package Pratices.Trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BT {

    class Node{
        int data;
        Node leftchild;
        Node rightchild;

        Node(int data){
            this.data=data;
        }
    }

    private Node create() {
        Queue<Node> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root value's");
        Node root = new Node(scanner.nextInt());
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.println("Enter left child of "+temp.data);
            int t= scanner.nextInt();
            if(t!=-1){
                Node node = new Node(t);
                temp.leftchild=node;
                queue.add(node);
            }
            System.out.println("Enter Right child of "+temp.data);
            int ta= scanner.nextInt();
            if(ta!=-1){
                Node node = new Node(ta);
                temp.rightchild=node;
                queue.add(node);
            }
        }
        return root;

    }
    private void preorder(Node root){

        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);

    }


    private void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.leftchild);
        System.out.print(root.data+" ");
        inorder(root.rightchild);

    }


    private void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.leftchild);
        postorder(root.rightchild);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        BT bt = new BT();
        Node root =bt.create();
      /*  bt.preorder(root);
        System.out.println();
        bt.inorder(root);
        System.out.println();
        bt.postorder(root);*/
        System.out.println("Preorder");
        bt.preorder(root);
        System.out.println("Preorder");
        bt.iterpreorder(root);
        //bt.inorder(root);
       // System.out.println("Inorder");
       // bt.iterinorder(root);
    }

    //1 2 3 4 5 -1 -1 -1 -1 -1 -1

    private void iterinorder(Node root) {
        if(root==null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            Node node = stack.peek();

            if(node.rightchild!=null){
                stack.add(node.rightchild);
            }

            if(node.leftchild!=null){
                stack.add(node.leftchild);
            }
            System.out.print(node.data+" ");
        }
    }

    private void iterpreorder(Node root) {

        if(root==null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        while (root!=null || stack.isEmpty()){
            System.out.print(root.data+" ");

            if(root.leftchild!=null){
                stack.push(root.leftchild);
                root=root.leftchild;
            }else {

              if(root.rightchild!=null)
                root=root.rightchild;
                stack.pop();
            }
        }
    }


}
