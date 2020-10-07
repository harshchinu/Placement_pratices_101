package Pratices.Arrays;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int operation = s.nextInt();
        long arr[]=new long[size];

        for(int i=0;i<size;i++){
            arr[i]=s.nextLong();
        }

        PriorityQueue<Long> mQueue =
                new PriorityQueue<Long>(Collections.reverseOrder());

        PriorityQueue<Long> dQueue =
                new PriorityQueue<Long>();

        // Adding items to the pQueue using add()

        for(int i=0;i<arr.length;i++){
            mQueue.add(arr[i]);
            dQueue.add(arr[i]);
        }


        while(operation-->0){

            long mul=mQueue.poll();
            mul*=2;
            mQueue.add(mul);

            long div=dQueue.poll();
            if(div%2==1){
                dQueue.add((div/2)+1);
            }else{
                dQueue.add(div/2);
            }
        }

        long sum=0;
       /* Iterator itr = mQueue.iterator();
          Iterator itr1 = dQueue.iterator();
        while (itr.hasNext() && itr.hasNext()){
                if(itr.next()==itr1.next()){
                    sum+=itr.next();
                }else{
                    sum+=itr.next();
                    sum+=itr1.next();
                }
        }*/

        Object[] arr1 = mQueue.toArray();
        Object[] arr2 = dQueue.toArray();
        int i=0;
        while(i<arr1.length){
            if(arr1[i].equals(arr2[i])){

                sum+=(int)arr1[i];
            }else{
                sum+=(int)arr1[i]+(int)arr2[i];
            }
            i++;
        }

        System.out.println(sum);

    }
}
