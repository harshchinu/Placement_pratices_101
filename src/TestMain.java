import java.awt.*;
import java.util.*;

public class TestMain {


        public static void main (String[] args) throws java.lang.Exception {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int p = s.nextInt();
            int temp=x;
            int arr[] = new int[p+1];

            int dark = 0;
            while (x-- > 0) {

                int l = s.nextInt();
                int r = s.nextInt();

                int i=l;
                while (i<=p && i<=l+r ){
                    if (arr[i] == 0) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 2;
                    }
                    i++;
                }

                i=l-1;
                while (i>0 && i>=l-r){
                    if (arr[i] == 0) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 2;
                    }
                    i--;
                }
                if(i==0){
                    if (arr[i] == 0) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 2;
                    }
                }



            }
            int max=0;
            for (int i = 0; i <=p; i++) {
                if (arr[i] ==2 || arr[i]==0) {
                    dark++;
                }else{
                    max=Math.max(max,dark);
                    dark=0;
                }
            }
            System.out.println(Math.max(dark,max));

        }






}
