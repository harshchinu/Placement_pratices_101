package Pratices.Arrays;

public class Maximumsubarraysum {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};

        int currentsum=nums[0];
        int maxsum=nums[0];

        for(int i=0;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);

            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        System.out.println(maxsum);
    }
}
