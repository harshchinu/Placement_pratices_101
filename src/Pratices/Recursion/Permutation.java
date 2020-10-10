package Pratices.Recursion;

public class Permutation {
    public static void main(String[] args) {
        int num[]= {1,2,3,4};

        int buffer[] = new int[4];
        boolean isbuffer[] = new boolean[4];

        printPremuttaiton(num,buffer, isbuffer,0);

    }

    private static void printPremuttaiton(int[] num, int[] buffer, boolean[] isbuffer, int bufferIndex) {
        if(bufferIndex==buffer.length){
            printArray(buffer);
            return;
        }

        for(int i=0;i<num.length;i++){
           if(!isbuffer[i]) {
               buffer[bufferIndex] = num[i];
               isbuffer[i] = true;

               printPremuttaiton(num, buffer, isbuffer,  bufferIndex + 1);
               isbuffer[i] = false;
           }

        }

    }

    private static void printArray(int[] buffer) {
        System.out.println();
        for(int i=0;i<buffer.length;i++){
            System.out.print(buffer[i]);
        }
    }
}
