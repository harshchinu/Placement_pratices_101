package Pratices.Arrays;

public class RepeatMissingNumber {
    public static void main(String[] args) {
        int arr[]={3,1,3};

        Integer max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int arr1[]= new int[max+1];

        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            int arrayvalue=arr1[value];
            arr1[value]=arrayvalue+1;
        }

        int missingelement=0,duplicates=0;
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>1){
                duplicates=i;
            }
            if(arr1[i]==0){
                missingelement=i;
            }
        }

        System.out.println(missingelement);
        System.out.println(duplicates);
    }
}
