package Pratices.Dunzopreparation.Backtracking;

import java.util.HashMap;

public class FibWithMemo {


    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int fib=Fibwithoutmemo(25);
        System.out.println(fib);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));

        final long startTime1 = System.currentTimeMillis();
        HashMap<Integer,Integer> memo=new HashMap<>();
        int fib1=Fibwithmemo(50, memo);
        System.out.println(fib1);
        final long endTime1 = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime1 - startTime1));
    }

    private static int Fibwithmemo(int i, HashMap<Integer, Integer> memo) {
        if(i==0 || i==1)
            return i;

        if(memo.containsKey(i)){
            return memo.get(i);
        }else {
            int result = Fibwithoutmemo(i - 1) + Fibwithoutmemo(i - 2);

            // memoize
            memo.put(i, result);

            return result;
        }
    }

    private static int Fibwithoutmemo(int n) {
        if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return Fibwithoutmemo(n - 1) + Fibwithoutmemo(n - 2);
        }
    }
}
