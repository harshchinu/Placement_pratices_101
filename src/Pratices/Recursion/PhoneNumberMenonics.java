package Pratices.Recursion;

import java.util.ArrayList;

public class PhoneNumberMenonics {
    public static void main(String[] args) {
    int arr[] = {2,3,4};
    char buffer[] = new char[arr.length];

    printWords(arr,buffer,0,0);

    }

    private static void printWords(int[] arr, char[] buffer, int nextIndex, int bufferIndex) {

        if(bufferIndex==buffer.length || nextIndex==buffer.length){
            printArray(buffer);
            return;
        }

        char[] chars = getLetters(arr[nextIndex]);

        for(Character c:chars){
            buffer[bufferIndex]=c;

            printWords(arr,buffer,nextIndex+1,bufferIndex+1);
        }

    }

    private static void printArray(char[] buffer) {
        System.out.println();
        for(char c: buffer){
            System.out.print(c+" ");
        }
    }

    public static char[] getLetters(int number){

        ArrayList<Character>  characters= new ArrayList<>(3);
        characters.clear();
        switch (number){
            case 2:
                characters.clear();
                characters.add('a');
                characters.add('b');
                characters.add('c');
                break;
            case 3:
                characters.clear();
                characters.add('d');
                characters.add('e');
                characters.add('f');
                break;

            case 4:
                characters.clear();
                characters.add('g');
                characters.add('h');
                characters.add('i');
                break;
            case 5:
                characters.clear();
                characters.add('j');
                characters.add('k');
                characters.add('l');
                break;
            case 6:
                characters.clear();
                characters.add('m');
                characters.add('n');
                characters.add('o');
                break;
            case 7:
                characters.clear();
                characters.add('p');
                characters.add('q');
                characters.add('r');
                characters.add('s');
                break;

            case 8:
                characters.clear();
                characters.add('t');
                characters.add('u');
                characters.add('v');
                break;

            case 9:
                characters.clear();
                characters.add('w');
                characters.add('x');
                characters.add('y');
                characters.add('z');
                break;

        }
        char[]  chars= new char[characters.size()];
        int i=0;
        for(Character c:characters){
            chars[i]=c;
            i++;
        }
        return chars;
    }
}
