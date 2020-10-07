package Pratices.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int nums[] = {0,1,1,0,1,2,1,2,0,0,0,1};

        int low=0,mid=0,high=nums.length-1;

        while (mid<=high){

            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }



        }

        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
        }

    }

    private static void swap(int[] nums, int mid, int low) {

        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
    }


}
