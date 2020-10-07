package Pratices.Arrays;

import java.util.Arrays;

public class isUnique {
    public static void main(String[] args) {
        String str ="abcd10jk";
        boolean flag=true;
        /*for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
        }*/


        //optimising it previous one was brute force algoritm we can't use any other data structure we do one thing here we sort the string and check i+1 if it's same or
        //it will reduce O(n^2) to (n log n) which great

        char[] arr=str.toCharArray();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println(true);
        }else {
            System  .out.println(false);
        }
    }

    //question said without using additon data structure else we use a array or hashmap to store previos char and check when it is repeated or not
    //in that way we had finished that in o(n) with space o(n);
}
