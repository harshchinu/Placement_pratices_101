package Pratices.Arrays;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] m = {

                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

         boolean row[]=new boolean[m.length];
        boolean colum[]=new boolean[m[0].length];

      for(int i=0;i<row.length;i++){
          for(int j=0;j<m[0].length;j++){
              if(m[i][j]==0){
                  row[i]=true;
                  colum[j]=true;
              }
          }
      }


        for(int i=0;i<row.length;i++){
            for(int j=0;j<m[0].length;j++){
               if(row[i]==true || colum[j]==true){
                   m[i][j]=0;

               }
            }
        }




        int n = m.length;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(m[k][l]+" ");
            }
            System.out.println();
        }
    }
}
