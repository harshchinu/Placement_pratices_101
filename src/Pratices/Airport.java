package Pratices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Airport {
    public static int buttomgoing(List<List<Integer>> mat, int i, int j, int count, HashMap<String,Integer> memo, boolean flag){
        if(flag){
            return 0;
        }
        if(i==mat.size()-1 && j==mat.get(i).size()-1 && mat.get(i).get(j)==-1){
            flag=true;

        }
        if(i==mat.size()-1 && j==mat.get(i).size()-1) {
            mat.get(i).set(j, 0);
            return topup(mat,i,j,count+1,memo);
        }

        if(memo.containsKey(i+" "+j)){
            return memo.get(i+" "+j);
        }else {
            if ((i < mat.size() && j < mat.get(i).size() ) && mat.get(i).get(j) == 0) {
               memo.put(i+" "+j,Math.max(buttomgoing(mat, i, j+1 , count,memo,flag), buttomgoing(mat, i+1, j, count,memo,flag)));
               return memo.get(i+" "+j);
            }
            if ((i < mat.size() && j < mat.get(i).size()) &&  mat.get(i).get(j) == 1) {
                mat.get(i).set(j, 0);
                memo.put(i+" "+j,Math.max(buttomgoing(mat, i, j+1, count + 1,memo,flag), buttomgoing(mat, i+1 , j, count + 1,memo,flag)));
                return memo.get(i+" "+j);
            }
        }

        return count;

    }

    public static int topup(List<List<Integer>> mat, int i, int j, int count, HashMap<String, Integer> memo){
        if(i==0 && j==0){
            return count;
        }

        if(memo.containsKey(i+" "+j)){
            return memo.get(i+" "+j);
        }else {
            if ((i >=0 && j>=0) && mat.get(i).get(j) == 0) {
                memo.put(i+" "+j,Math.max(topup(mat, i, j -1, count,memo), topup(mat, i -1, j, count,memo)));
                return memo.get(i+" "+j);
            }
            if ((i >=0 && j>=0) && mat.get(i).get(j) == 1) {
                mat.get(i).set(j, 0);
                memo.put(i+" "+j,Math.max(topup(mat, i, j -1, count + 1,memo), topup(mat, i -1, j, count + 1,memo)));
                return memo.get(i+" "+j);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        List<List<Integer>> mat = new ArrayList<>();
        List<Integer> integer1 = new ArrayList<>();
        integer1.add(1);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);
        integer1.add(0);

        List<Integer> integer2 = new ArrayList<>();
        integer2.add(0);
        integer2.add(0);
        integer2.add(0);
        integer2.add(0);
        integer2.add(0);
        integer2.add(1);
        integer2.add(1);
        integer2.add(-1);
        integer2.add(0);

        List<Integer> integer3 = new ArrayList<>();
        integer3.add(0);
        integer3.add(0);
        integer3.add(1);
        integer3.add(1);
        integer3.add(0);
        integer3.add(0);
        integer3.add(0);
        integer3.add(-1);
        integer3.add(1);

        List<Integer> integer4 = new ArrayList<>();
        integer4.add(0);
        integer4.add(0);
        integer4.add(-1);
        integer4.add(-1);
        integer4.add(-1);
        integer4.add(-1);
        integer4.add(1);
        integer4.add(-1);
        integer4.add(0);

        List<Integer> integer5 = new ArrayList<>();
        integer5.add(0);
        integer5.add(1);
        integer5.add(0);
        integer5.add(-1);
        integer5.add(1);
        integer5.add(0);
        integer5.add(1);
        integer5.add(-1);
        integer5.add(0);

        List<Integer> integer6 = new ArrayList<>();
        integer6.add(0);
        integer6.add(0);
        integer6.add(0);
        integer6.add(-1);
        integer6.add(1);
        integer6.add(1);
        integer6.add(0);
        integer6.add(0);
        integer6.add(0);

        List<Integer> integer7 = new ArrayList<>();
        integer7.add(1);
        integer7.add(0);
        integer7.add(0);
        integer7.add(0);
        integer7.add(0);
        integer7.add(0);
        integer7.add(0);
        integer7.add(0);
        integer7.add(1);

        mat.add(integer1);
        mat.add(integer2);
        mat.add(integer3);
        mat.add(integer4);
        mat.add(integer5);
        mat.add(integer6);
        mat.add(integer7);

        HashMap<String,Integer> hashMap = new HashMap<>();
        int c;
        int i=mat.size()-1;
        int j=mat.get(0).size()-1;
        if(mat.get(i).get(j)==-1){
            c=0;
        }else {
            c = buttomgoing(mat, 0, 0, 0, hashMap, false);
        }
        System.out.println(c);


    }

}
