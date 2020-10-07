package Pratices.Arrays;

public class Prductofarrayexpextself {

    public static void main(String[] args) {


        int arr[]={-2,3,4};


       /* int finalsum[]=new int[arr.length];


        finalsum[0]=1;
        for(int i=1;i<arr.length;i++){
            finalsum[i]=arr[i-1]*finalsum[i-1];
        }

        int r=1;
        for(int i=arr.length-1;i>=0;i--){
            finalsum[i]=finalsum[i]*r;
            r=r*arr[i];
        }





       return finalsum;*/


        int current = arr[0];
        int global =arr[0];

        for(int i=0;i<arr.length;i++){
            current=Math.max(arr[i],current*arr[i]);

            if(current>global){
                global=current;
            }


        }
        System.out.println(Math.abs(global/arr[0]));
    }

}
