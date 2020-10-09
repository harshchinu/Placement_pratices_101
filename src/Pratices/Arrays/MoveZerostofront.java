package Pratices.Arrays;

public class MoveZerostofront {
    public static void main(String[] args) {
        int arr[] = {0,4,0,1,2,0,3};
        //movetofront(arr);
        movetoback(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    private static void movetoback(int[] arr) {
        int j=arr.length-1;
        int i=arr.length-1;
        while (i>=0){
            if(arr[i]==0){
                swap(arr,i,j);
                j--;

            }
            i--;
        }
    }

    private static void movetofront(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                swap(arr,i,j);
                j++;
            }
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
