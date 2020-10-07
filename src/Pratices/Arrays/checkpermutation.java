package Pratices.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class checkpermutation {
    public static void main(String[] args) {
        String a = "coffee";
        String b = "fefeoc";

        //n log n approach is to sort the both string check if they are equal then they are permutation of each other

        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMapa = new HashMap<>();

        if (a.length() != b.length()) {
            //return;
        }
        for (int i = 0; i < a.length(); i++) {
            Integer c = hashMap.get(a.charAt(i));
            if (c == null) {
                hashMap.put(a.charAt(i), 1);
            } else {
                hashMap.put(a.charAt(i), c++);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            Integer c = hashMapa.get(b.charAt(i));
            if (c == null) {
                hashMapa.put(b.charAt(i), 1);
            } else {
                hashMapa.put(b.charAt(i), c++);
            }
        }



        if(hashMap.equals(hashMapa)){
            System  .out.println(true);
        }else {
            System  .out.println(false);
        }
    }
}
