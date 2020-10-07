package Pratices.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        String str="aabcccccaaa";

        StringBuilder stringBuilder = new StringBuilder();

        char st=str.charAt(0);
        int count=1;
        for(int i=0;i<str.length()-1;i++){
          if(st==str.charAt(i+1)){
              count++;
              st=str.charAt(i+1);
              if(i==str.length()-2){
                  stringBuilder.append(str.charAt(i)).append(count);
              }
          }else {
              stringBuilder.append(str.charAt(i)).append(count);
              st=str.charAt(i+1);
              count=1;
          }


        }
        System.out.println(stringBuilder.toString());
    }

}
