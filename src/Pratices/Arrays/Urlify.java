package Pratices.Arrays;

public class Urlify {
    public static void main(String[] args) {
            String str="Mr John Smith";

            String a[] = str.split(" ");

            StringBuilder stringBuilder = new StringBuilder();

            for(int i=0;i<a.length;i++){
                stringBuilder.append(a[i]);
                if(i==a.length-1){
                    break;
                }
                stringBuilder.append("%20");
            }



            System.out.println(stringBuilder.toString());
        }
}
