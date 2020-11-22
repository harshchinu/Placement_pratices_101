import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dunzo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(20);
        num.add(7);

        Collections.sort(num);
        int arr[]=new int[num.get(num.size()-1)+1];

        for(Integer n:num){
            arr[n]+=1;
        }
        int k=4;
        int j=arr.length-1;
        while (j>0 && k>0){
            while (arr[j]>0){
                int div= (int) Math.ceil(j/2d);
                arr[div]=arr[div]+1;
                arr[j]=arr[j]-1;
                k--;
            }
            j--;

        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            while (arr[i]>0){
                sum+=i;
                arr[i]=arr[i]-1;
            }
        }

        System.out.println(sum);

    }
}
