package Pratices.Trees;

import java.util.Scanner;

public class BST {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }

    }
    Node root;
    public static void main(String[] args) {
        BST bst = new BST();
        bst.createBST();
        bst.createBST();
        bst.createBST();
        bst.createBST();
        bst.print(bst.root);
    }

    private void print(Node root) {
        if(root==null)
            return;
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    private void createBST(){
        Scanner sc = new Scanner(System.in);
        int va = 0;
        if(root==null) {
           System.out.println("Enter root's data");
           va=sc.nextInt();
        }
        root=createBST(root,va);
    }

    private Node createBST(Node root,int value) {
        Scanner sc = new Scanner(System.in);
        if(root==null){
          return new Node(value);
        }else {
            int valuea=sc.nextInt();
            if(valuea>root.data){
                root.right=createBST(root.right,valuea);
            }else {
                root.left=createBST(root.left,valuea);
            }
        }
        return root;
    }
}
