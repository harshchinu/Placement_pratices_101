package Pratices.BinaryTrees;

import Pratices.Graph.Pair;

import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(4);

        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node1 =new Node(1);
        Node node5= new Node(5);
        Node node6= new Node(6);
        Node node7= new Node(7);

       node2.leftchild=node1;
       node2.rightchild=node3;

       node6.leftchild=node5;
       node6.rightchild=node7;

       root.leftchild=node2;
       root.rightchild=node6;




        inOrder(root);
        System  .out.println();
        preOrder(root);
        System  .out    .println();
        postOrder(root);

        System.out.println();

        iterativeInorder(root);
        System.out.println();
        iterativePreorder(root);
        System.out.println();
        IterativePostorder(root);
        System.out.println();

    }

    private static void IterativePostorder(Node root) {
    }

    private static void iterativePreorder(Node root) {
    }

    private static void iterativeInorder(Node root) {

        java.util.Stack<Node> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()){
            

        }
    }

    private static void postOrder(Node root) {
        if(root==null) return;
        postOrder(root.leftchild);
        postOrder(root.rightchild);
        System.out.print(root.data+" ");
    }

    private static void preOrder(Node root) {
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.leftchild);
        preOrder(root.rightchild);
    }

    private static void inOrder(Node root) {
        if(root==null)return;
        inOrder(root.leftchild);
        System.out.print(root.data+" ");
        inOrder(root.rightchild);

    }
}
