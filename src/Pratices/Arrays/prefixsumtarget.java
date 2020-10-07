package Pratices.Arrays;

import java.util.HashMap;

public class prefixsumtarget {
    public static void main(String[] args) {
        //int arr[]={-1,2,1,-4,2,3,-1,2};
      /*  HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                System.out.println("0 ,"+i);

            }
            if(hashMap.containsKey(sum)){
                System.out.println(hashMap.get(sum)+1+", "+i);
            }
            hashMap.put(sum,i);*/
        //}

        int arr[]={5,3,1,7,6,4,2,3};
        int target = 14;
        int start=0,end=0;
        int sum=arr[0];
        while (start<arr.length-1){
            if(start>end){
                end=start;
                sum=arr[start];
            }

           if(sum<target){
               if(end==arr.length-1){
                   break;
               }
               end++;
               sum+=arr[end];
           }else if(sum>target){

               sum-=arr[start];
               start++;
           }else {
               System.out.println(start+" "+end);
               break;
           }


        }
    }
}
