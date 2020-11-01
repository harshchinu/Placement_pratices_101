package Pratices.LL;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LRU {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int A=s.nextInt();
        int q=s.nextInt();
        int Arr[]= new int[A];
        for(int i=0;i<Arr.length;i++){
            Arr[i]=s.nextInt();
        }
        while(q-->0){

            int l=s.nextInt();
            int r=s.nextInt();
            int sum=0;
            for(int i=r;i>=l;i--){
                int x=(i*(i+1))/2;
                sum+=x;
            }
            System.out.println(sum);


        }

    }
}
