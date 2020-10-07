package Pratices.Arrays;

import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str="code";

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(Character s:str.toCharArray()) {
            Integer a = hashMap.get(s);

            if (a == null) {
                hashMap.put(s, 1);
            } else {
                a++;
                hashMap.put(s, a);
            }
        }

        int count=0;
        for(Integer i:hashMap.values()){
            count+=i%2;
        }

        System.out.println(count<=1);

    }
}
