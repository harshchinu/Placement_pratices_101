package Pratices.Recursion;

public class Combinationsof3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int buffer[] = new int[3];
        int startIndex=0;
        int bufferIndex=0;
        printCombos(arr,buffer,startIndex,bufferIndex);
        //printArray(buffer);

    }

    private static void printCombos(int[] arr, int[] buffer, int startIndex, int bufferIndex) {

        //termination case one combination completed
        if(bufferIndex==buffer.length) {
        printArray(buffer);
        return;
    }

        //all combination generated or last combination
        if(startIndex==arr.length) {
            return;
        }


        for(int i=startIndex;i<arr.length;i++){
            buffer[bufferIndex]=arr[i];

            printCombos(arr,buffer,i+1,bufferIndex+1);
        }



    }

    private static void printArray(int[] buffer) {
        System.out.println();
        for(int i=0;i<buffer.length;i++){
            System.out.print(buffer[i]);
        }
    }
}
