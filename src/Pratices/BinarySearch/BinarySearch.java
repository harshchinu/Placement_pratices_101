package Pratices.BinarySearch;


public class BinarySearch {
    public static void main(String[] args) {
        //int arr[] = {10,20,30,40,50,60,70,80,90,100};
        //int target = 23;

        int arr[] = {7,8,9,2,3,4};
        int low =0, high = arr.length-1;
        //int foundornot = recursivebinarySearch(arr,low,high,target);
        //System.out.println(foundornot);
        //int foundornot = iterativeBinarySearch(arr,low,high,target);
        //System.out.println(foundornot);
        //int foundornot=findfirstOccurence(arr,target);
        //System.out.println(foundornot);
      //  int foundclosed = findClosestone(arr,target);
       // System.out.println(foundclosed);

        int foundminimun= findminimumnCyclic(arr);
        System.out.println(foundminimun);
    }

    private static int findminimumnCyclic(int[] arr) {
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(mid>0 && arr[mid-1]>arr[mid])
                return arr[mid];
            else if(arr[mid]>arr[mid+1])
                low=mid-1;
            else
                high=mid+1;
        }

        return -1;
    }

    private static int findClosestone(int[] arr, int target) {
        int low=0,high=arr.length-1;
        int max = Integer.MAX_VALUE;
        while (low<=high){
            int mid = low+(high-low)/2;
            max = Math.min(max, arr[mid]);
            if(arr[mid]>target) {
                high = mid - 1;
            }
            else if(arr[mid]<target) {
                low = mid + 1;
            }
            else
                return max;
        }

        return max;
    }

    private static int findfirstOccurence(int[] arr, int target) {
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target || (arr[mid]==target && mid>0 && arr[mid-1]==target))
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else
               return mid;
        }

        return -1;
    }

    private static int iterativeBinarySearch(int[] arr, int low, int high, int target) {
        int out =-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else
                out=mid;
        }

        return out;
    }

    private static int recursivebinarySearch(int[] arr,int low,int high, int target) {

        int mid =  low+(high-low)/2;

        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>target)
            return recursivebinarySearch(arr,low,mid-1,target);
        else if(arr[mid]<target)
            return recursivebinarySearch(arr,mid+1,high,target);

        return -1;
    }
}
