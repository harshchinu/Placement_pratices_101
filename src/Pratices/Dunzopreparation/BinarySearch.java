package Pratices.Dunzopreparation;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int index = binarySearch(arr, 2);
        index = binarySeachforFirstOccurence(arr, 2);
        index=binarySearchforclosest(arr,23);
        System.out.println(index);

        int arr1[] = {7,8,1,2,4,6};

        index=binarSearchforcyclicarray(arr1,4);
        System.out.println(index);
    }

    private static int binarSearchforcyclicarray(int[] arr1, int target) {

        int start = 0, end = arr1.length - 1,right=arr1[arr1.length-1];

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr1[mid]<=right && (mid==0 ||arr1[mid-1]>arr1[mid]) ){
                return arr1[mid];
            }else if(arr1[mid]>right){
                start=mid+1;
            }else {
                end=mid-1;
            }




        }


        return -1;
    }

    private static int binarySearchforclosest(int[] arr, int target) {
        int start = 0, end = arr.length - 1,closest=Integer.MAX_VALUE;
        while (start <= end) {

            int mid = (start + (end - start) / 2);
            closest=record(arr,mid,closest,target);
            if (arr[mid] == closest) {
                if (mid > 0 && arr[mid - 1] == target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int record(int[] arr, int mid, int closest, int target) {
        if(closest==Integer.MAX_VALUE){
            closest=arr[mid];
            return closest;
        }else if(diff(arr[mid],target)<diff(arr[closest],target)){
            closest=mid;
            return closest;
        }
        return -1;
    }

    private static int diff(int i, int target) {
        return Math.abs(i-target);
    }

    private static int binarySeachforFirstOccurence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid - 1] == target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }


        return -1;

    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }
}

