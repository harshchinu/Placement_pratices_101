package Pratices.Arrays;

public class TrapeedRainingWater {
    public static void main(String[] args) {
        //[0,1,0,2,1,0,1,3,2,1,2,1]
        int arr[] = {2,0,2};

        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];

        leftmax[0]=arr[0];
        rightmax[arr.length-1]=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }


        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }

        int watersum=0;



        for(int i=0;i<arr.length;i++){
           watersum+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }

        System.out.println(watersum);
    }
}
