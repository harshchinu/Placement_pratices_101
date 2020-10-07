package Pratices.Dynamic_programming;

import java.util.HashMap;

public class knapsackbounded {
    public static void main(String[] args) {
        int wt[] = { 10, 20, 30};
        int val[] = {60, 100, 120};
        int w=50;
        HashMap<String,Integer> memonisation = new HashMap<>();
        int c=recursivetopdown(wt,val,w,wt.length-1,memonisation);
        System.out.println(c);
        c=bottomup(wt,val,w);
                System.out.println(c);

    }

    private static int bottomup(int[] wt, int[] val, int w) {
        int t[][] = new int[wt.length+1][w+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }else {
                    t[i][j]=t[i-1][j];
                }

            }
        }
        return t[t.length-1][t[0].length-1];
    }

    private static int recursivetopdown(int[] wt, int[] val, int w, int i, HashMap<String, Integer> memonisation) {
        if(i<0 || w==0){
            return 0;
        }

        String key = wt[i]+"|"+val[i]+"|"+i;

        if(!memonisation.containsKey(key)) {
            if (wt[i] > w) {
                memonisation.put(key, recursivetopdown(wt, val, w, i - 1, memonisation));
            } else {
                memonisation.put(key, Math.max(val[i] + recursivetopdown(wt, val, w - wt[i], i - 1, memonisation),
                        recursivetopdown(wt, val, w, i - 1, memonisation)));
            }
        }

        return memonisation.get(key);

    }
}
