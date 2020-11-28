package Pratices.BinaryTrees;

import java.util.*;

public class BinaryTree {
    public static void main(String[] args) {
       Node root = new Node(10);
        Node root1 = new Node(10);

        Node node15= new Node(15);
        Node node30= new Node(30);
        Node node3 =new Node(3);
        Node node6= new Node(6);
        Node node5= new Node(5);
        Node node2= new Node(2);

        Node node9= new Node(9);
        Node node8= new Node(8);


        node3.leftchild=node5;
        node15.leftchild=node3;
        node15.rightchild=node6;

        root.leftchild=node15;
        root1.leftchild=node15;

        node30.rightchild=node2;
        node2.leftchild=node9;

        node2.rightchild=node8;

        root.rightchild=node30;
        root1.rightchild=node30;


    /*    Node root = new Node(10);
        Node node5 = new Node(5);
        Node node16 = new Node(16);
        Node node3 = new Node(-3);
        Node node6 = new Node(6);
        Node node11= new Node(11);

        root.leftchild=node16;
        node16.rightchild=node3;

        root.rightchild=node5;
        node5.leftchild=node6;
        node5.rightchild=node11;*/




        inOrder(root);
        System  .out.println();
        preOrder(root);
        System  .out    .println();
        postOrder(root);

        System.out.println();

        //System.out.println(sameBinaryTreeornot(root,root1));

        System.out.println(sizeoftree(root));


        System.out.println(heightoftree(root));
        List<Integer> result = new ArrayList<>();
        System.out.println(roottoleftSum(root,26,result));
        System.out.println(result.toString());

        levelordertraversal(root);
        System.out.println();
        postorderIterative(root);
    }

    private static void postorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();



        while (true){
            while (root!=null){
                stack.push(root);
                stack.push(root);
                root=root.leftchild;
            }

            if(stack.isEmpty()) return;
            root = stack.pop();
            if(!stack.isEmpty() && stack.peek()==root)
                root=root.rightchild;
            else {
                System.out.print(root.data + " ");
                root = null;
            }

        }
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

    private static boolean roottoleftSum(Node root, int sum, List<Integer> result) {
        if(root==null)
            return false;

        if(root.leftchild==null && root.rightchild==null && root.data==sum){
            result.add(root.data);
            return true;
        }

        if(roottoleftSum(root.leftchild,sum-root.data,result)){
            result.add(root.data);
            return true;
        }
       if(roottoleftSum(root.rightchild,sum-root.data, result)){
           result.add(root.data);
           return true;

       }
        return false;
    }

    private static int heightoftree(Node root) {
        if(root==null) return 0;
        int leftsize = sizeoftree(root.leftchild);
        int rightsize =sizeoftree(root.rightchild);

        return 1+Math.max(leftsize,rightsize);
    }

    private static int sizeoftree(Node root) {
        if(root==null) return 0;
        int leftsize = sizeoftree(root.leftchild);
        int rightsize =sizeoftree(root.rightchild);

        return leftsize+rightsize+1;
    }

    private static Boolean sameBinaryTreeornot(Node root, Node root1) {
        if(root==null && root1==null)
            return true;

        if(root1==null || root==null)
            return false;


        return root.data==root1.data && sameBinaryTreeornot(root.leftchild,root1.leftchild) && sameBinaryTreeornot(root.rightchild,root1.rightchild);

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
