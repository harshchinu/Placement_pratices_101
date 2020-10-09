package Pratices.Arrays;

public class ReplaceSame {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 0, 3, -1, -1, -1};
        int j = arr.length;
        int i = 4;
        while (i >= 0) {
            if ((arr[i] & 1) != 1) {
                j--;
                arr[j] = arr[i];
                j--;
                arr[j] = arr[i];
            } else {
                j--;
                arr[j] = arr[i];

            }
        i--;
        }


        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
