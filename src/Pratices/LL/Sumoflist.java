package Pratices.LL;

public class Sumoflist {
    static class Node<T>{
        T data;
        Node next;


        Node(T data){
            this.data=data;

        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Node's Data is "+data);
            stringBuilder.append("\n");
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Sumoflist head;

        
    }
}
