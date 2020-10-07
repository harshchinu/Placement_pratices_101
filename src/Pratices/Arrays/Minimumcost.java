package Pratices.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimumcost {
    public static void main(String[] args) {
        int test=0;
        Scanner sc= new Scanner(System.in);
        test=sc.nextInt();
        while (test-->0){

            long d=sc.nextLong();
            long x=sc.nextLong();

            int cost=minimumc(d,x,0);

            System.out.println(cost);
        }
    }

    private static int minimumc(long d, long x, int cost) {

        if(d%2==1){
            return -1;
        }
         if(x==d){
            return cost;
        }else {
            if(d>x){
                return -1;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i < d; i++) {
            if(d%i == 0) {
                arrayList.add(i);
            }
        }

        int j=arrayList.size()-1;

        while(j>0){
            if((d+arrayList.get(j))%2==1){
                j--;
             }else if((d+arrayList.get(j))>x) {
                j--;
            }else {
                break;
            }
        }


        cost+=d/arrayList.get(j);
        return minimumc(d+arrayList.get(j),x,cost);
    }
}
