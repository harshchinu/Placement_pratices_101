import java.util.*;

public class Minimunsum {



        public static void main(String[] args) {
        int size=0,k=0;

        Scanner scanner = new Scanner(System.in);

        size=scanner.nextInt();

        k=scanner.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());


            for(int i=0;i<size;i++){
            int temp =scanner.nextInt();
            priorityQueue.add(temp);
        }

        while (k>0){
            int temp=priorityQueue.peek();
            priorityQueue.remove(temp);
            priorityQueue.add(temp/2);
;            //maxHeap.add((int) Math.floorDiv(temp,2));
            k--;
        }


        Object arr[] = priorityQueue.toArray();
        int sum=0;
        for(Object i : arr){
            sum+=(int)i;
        }

        System.out.println(sum);

    }

}
