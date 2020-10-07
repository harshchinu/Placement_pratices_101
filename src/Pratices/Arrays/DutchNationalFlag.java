package Pratices.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int pivot =4;
       // dutcunation(arr,pivot);
    /*    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        int sum =kadanealgoritm(arr);
        System.out.println(sum);
    }

    private static int kadanealgoritm(int[] arr) {
        int maxsofar=0,max=0;
        for(int i=0;i<arr.length;i++){
            maxsofar=Math.max(maxsofar+arr[i],arr[i]);

            if(maxsofar>max){
                max=maxsofar;
            }
        }
        return max;
    }

    private static void dutcunation(int[] arr, int pivot) {
        int low=0,high=arr.length-1;
        int i=0;
        while (i<=high){
            if(arr[i]<pivot){
                swap(arr,i,low);
                i++;
                low++;
            }else if(arr[i]>pivot){
                swap(arr,i,high);
                high--;
            }else {
                i++;
            }
        }

    }

    private static void swap(int[] arr, int i, int low) {
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
    }
}
