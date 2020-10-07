package Pratices.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
    public static void main(String[] args) {
        int a[][] = {
                {1,4},
                {1,5}
        };


        boolean flag=false;
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1])
                    return 1;
                else
                    return -1;
            }
        });

        if(a.length>2){
            flag=true;
        }
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();

        for(int i=0;i<a.length-1;i++){
            int first = a[i][1];
            int second = a[i+1][0];
            if(first>=second){
                ArrayList<Integer> c = new ArrayList<>();
                c.add(a[i][0]);
                c.add(a[i+1][1]);
                b.add(c);
                i++;
            }else {
                ArrayList<Integer> c = new ArrayList<>();
                c.add(a[i][0]);
                c.add(a[i][1]);
                b.add(c);
            }
        }

if(flag) {
    int first = a[a.length - 2][1];
    int second = a[a.length - 1][0];
    if (first >= second) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(a[a.length - 2][0]);
        c.add(a[a.length - 1][1]);
        b.add(c);
    } else {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(a[a.length - 1][0]);
        c.add(a[a.length - 1][1]);
        b.add(c);
    }
}

//Integer[][] finala=b.stream().map(u->u.toArray(new int[][]{new int[0]})).toArray((Integer[][]::new));

        int b1[][] = new int[b.size()][2];


        for(int i=0;i<b1.length;i++){
        b1[i][0]=b.get(i).get(0);
        b1[i][1]=b.get(i).get(1);
        }

        System.out.println(b.toString());


    }
}
