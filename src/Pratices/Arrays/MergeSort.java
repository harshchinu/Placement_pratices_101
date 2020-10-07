package Pratices.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={ 1, 20, 6, 4, 5 };

        int swap=mergesort(arr,0,arr.length-1);

        System.out.println(swap);
    }

    private static int mergesort(int[] arr, int low, int high) {
        int count =0;
        if(low<high){
          int  mid= (high+low)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        }
        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int swaps=0;
        int i = low, j = mid+1, k = low;
        int b[] = new int[arr.length];
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                j++;
                k++;
                swaps+=(mid+1)-(low+i);
            }
        }

        while (i <=mid) {
            b[k] = arr[i];
            i++;
            k++;
        }

        while (j <=high) {
            b[k] = arr[j];
            j++;
            k++;
        }


        for(int m=low;m<=high;m++){
            arr[m]=b[m];
        }

        return swaps;
    }
}
