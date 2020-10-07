package Pratices.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriange {
    public static void main(String[] args) {
        int n=5;

        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> a= new ArrayList<>();
        a.add(1);
        triangle.add(a);

        for(int i=1;i<n;i++){
            List<Integer> b=triangle.get(i-1);
            List<Integer> c = new ArrayList<>();
            c.add(1);
            for(int j=1;j<i;j++){
                c.add(b.get(j-1)+b.get(j));
            }
            c.add(1);
            triangle.add(c);
        }

        System.out  .println(triangle.toString());
    }
}
