package Pratices.Dunzopreparation;

public class move2 {
    public static void main(String[] args) {
        int input[] = {2,4,1,0,3,-1,-1,-1};

       // replacevenwith2(input);
        // reverseArray(input);

       /* int arr[]={1,5,3,5,6};
        twoSum(arr,10);*/

        //int arr[] = {2,4,0,3,0,1,0};
        //movezerotofront(arr);
        //printArray(arr);
       // movezertoback(arr);


      /*  int arr[]={3,2,4,1,6,3,7,5};
        dutchflag(arr,4);
        printArray(arr);*/

       /* int arr[]={-12, 11, -13, -5,
                6, -7, 5, -3, 11 };*/
        //moveallpositivenegative(arr);
        //printArray(arr);

        int  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(findMinimumjum(arr));

    }

    private static int findMinimumjum(int[] arr) {

        int jump[]=new int[arr.length];

        if (arr.length == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;

        int i,j;
         jump[0]=0;

         for(i=1;i<arr.length;i++){
             jump[i] = Integer.MAX_VALUE;
             for (j = 0; j < i; j++) {
                 if (i <= j + arr[j]
                         && jump[j]
                         != Integer.MAX_VALUE) {
                     jump[i] = Math.min(jump[i], jump[j] + 1);
                     break;
                 }
             }
         }
        return jump[arr.length - 1];
    }




    private static void moveallpositivenegative(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int mid=0;
        while (mid<=j){
            if(arr[mid]<0){
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                i++;
                mid++;
            }else {
                int temp=arr[j];
                arr[j]=arr[mid];
                arr[mid]=temp;
                j--;
            }
        }


    }

    private static void dutchflag(int[] arr, int pivot) {
        int i=0;
        int j= arr.length-1;
        int mid=0;

        while (mid<=j && i<j){
            if(arr[mid]<pivot) {
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                i++;

            }else if(arr[mid]>pivot){
                int temp=arr[j];
                arr[j]=arr[mid];
                arr[mid]=temp;
                j--;
                mid++;

            }else {
                mid++;
            }






        }





    }

    private static void movezertoback(int[] arr) {
        int cloud=arr.length;
        int boundary=arr.length;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==0){
                cloud--;
                boundary--;
                arr[i]=arr[boundary];
                arr[cloud]=0;

            }
        }


    }

    private static void movezerotofront(int[] arr) {
        int cloud=0;
        int boundary=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=arr[boundary];
                arr[cloud]=0;
                cloud++;
                boundary++;
            }
        }
    }

    private static void twoSum(int[] arr, int target) {
        int sum=0;
        int i=0,j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target){
                System  .out.println(arr[i]+" "+arr[j]);
                break;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else {
                i++;
            }
        }




    }

    private static void reverseArray(int[] input) {
        int i=0,j=input.length-1;
        while (i<j){
            int temp=input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;j--;
        }

    }

    private static void printArray(int[] input) {
        for(int i:input)
             System.out.print(i+",");
    }

    private static void replacevenwith2(int[] input) {

            int j=input.length-1;
            int i=4;

            while (i>=0){
                if(input[i]%2==0){
                    input[j]=input[i];
                    j--;
                    input[j]=input[i];
                    j--;
                }else {
                    input[j]=input[i];
                    j--;

                }
                i--;

            }





    }
}
