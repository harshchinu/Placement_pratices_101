package Pratices.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {
    public static void main(String[] args) {

        Node root = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of nodes to be insert");
        int numbersofnodes= scanner.nextInt();
       /* while (numbersofnodes-->0){
            int value=scanner.nextInt();
            root =InsertInBst(root,value);
        }*/

        while (numbersofnodes-->0){
            int value=scanner.nextInt();
            root=IterativeTreeinsertion(root,value);
        }



        Node found=searchInBST(root,30);
        //System.out.println(found.data);

        inOrder(root);

        System.out.println(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        levelordertraversal(root);
    }

    private static void levelordertraversal(Node root) {
        if(root==null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            root = queue.poll();

            System.out.print (root.data+" ");
            if(root.leftchild!=null)
                queue.add(root.leftchild);
            if(root.rightchild!=null)
                queue.add(root.rightchild);


        }
    }

    private static boolean isBst(Node root, int minValue, int maxValue) {
        if(root==null) return true;

        if(root.data<=minValue || root.data>maxValue){
            return false;
        }
        return isBst(root.leftchild,minValue,root.data) && isBst(root.rightchild,root.data,maxValue);
    }

    private static Node searchInBST(Node root, int i) {

        if(root==null) return null;

        else if(root.data==i){
            return root;
        }
        else if(i>root.data)
            return searchInBST(root.rightchild,i);
        else
           return searchInBST(root.leftchild,i);


    }

    private static Node IterativeTreeinsertion(Node root,int value) {
            Node node = new Node(value);

            if(root==null)
                return node;

            Node parent=null,current=root;

            while (current!=null){
                parent=current;

                if(current.data<=value){
                    current=current.rightchild;
                }else {
                    current=current.leftchild;
                }
            }
            if(parent.data<=value){
                parent.rightchild=node;
            }else {
                parent.leftchild=node;
            }

            return root;




    }

    private static Node InsertInBst(Node root, int value) {


        if(root==null)
            return new Node(value);

        else if(value>root.data){
            root.rightchild=InsertInBst(root.rightchild, value);
        }else {
            root.leftchild=InsertInBst(root.leftchild, value);
        }


        return root;

    }

    private static void inOrder(Node root) {
        if(root==null)return;
        inOrder(root.leftchild);
        System.out.print(root.data+" ");
        inOrder(root.rightchild);

    }
}
