import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node leftchild,rightchild;
    int data;

    Node(int data){
        this.data=data;
        leftchild=rightchild=null;
    }
}

public class binaryTree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Node root= new Node(sc.nextInt());
        createbinarytree(root);
        inorder(root);
        System.out.println(isBST(root));

    }

    // return true if the given tree is a BST, else return false
    static boolean isBST(Node root)
    {

        if(root==null){
            return true;
        }
        if(root.leftchild!=null && root.data<=root.leftchild.data){
            return false;
        }
        if(root.rightchild!= null && root.data>=root.rightchild.data){
            return false;
        }
        return(isBST(root.leftchild) && isBST(root.rightchild));
    }


    private static void inorder(Node root) {
        if(root!=null){
            inorder(root.leftchild);
            System.out.println(root.data);
            inorder(root.rightchild);
        }
    }

    private static void createbinarytree(Node root) {
        Scanner sc=new Scanner(System.in);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp=queue.remove();


            System.out.println("Enter left child of "+temp.data);
            int newData = sc.nextInt();
            if(newData!=-1){
                Node newTemp= new Node(newData);
                temp.leftchild=newTemp;
                queue.add(newTemp);
            }

            System.out.println("Enter Right child of "+temp.data);
            newData = sc.nextInt();
            if(newData!=-1){
                Node newTemp= new Node(newData);
                temp.rightchild=newTemp;
                queue.add(newTemp);
           }
        }

    }


//2 N 7 N 6 N 5 N 9 N 2 N 6
//1 1 1 1 1 N 1 1 1 1 1

}
