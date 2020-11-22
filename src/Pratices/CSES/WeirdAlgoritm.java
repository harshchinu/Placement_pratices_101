package Pratices.CSES;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class WeirdAlgoritm {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String sa=s.nextLine();

        TreeMap<Character,Integer> treeMap = new TreeMap<>((o1, o2) -> o2-o1);
        for(int i=0;i<sa.length();i++){
            Integer c=treeMap.get(sa.charAt(i));
            if(c==null){
                treeMap.put(sa.charAt(i),1);
            }else {
                treeMap.put(sa.charAt(i),c+1);
            }
        }

        System.out.println(treeMap.lastEntry().getValue());
    }
}
