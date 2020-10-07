package Pratices.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a1[] = {3, 27, 38, 43}, a2[] = {9, 10, 82};
/*
        int gap = (int) Math.ceil((a1.length + a2.length) / 2) + 1;

        int i = 0, j = 0;
        while (gap >=1) {

            while (i < a1.length || i + gap < a2.length) {
                if (i + gap > a1.length) {
                    j = a1.length - gap + i;

                    if (a1[i] < a2[j]) {
                            swap(a1, a2, i, j);
                    }
                } else {
                    j = i + gap-1;
                    if (a1[j] < a1[i]) {
                        swap(a1, i, j);
                    }


                }
                i++;



            }
            gap = gap / 2;


        }
        print(a1);
        print(a2);
    }



        private static void swap ( int[] a1, int i, int j){
            int temp = a1[j];
            a1[j] = a1[i];
            a1[i] = temp;
        }


*/


        int i=0,j=0;
        while (i<a1.length){

            if(a1[i]>a2[j]){
                swap(a1,a2,i,j);
                i++;
                Arrays.sort(a2);
            }else {
                i++;
            }

        }

        print(a1);
        print(a2);
        }
    private static void swap ( int[] a1, int[] a2, int i, int i1) {
        int temp = a2[i1];
        a2[i1] = a1[i];
        a1[i] = temp;
    }

    private static void print ( int[] a1){
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }


    }

