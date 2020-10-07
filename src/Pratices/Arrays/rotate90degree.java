package Pratices.Arrays;

public class rotate90degree {

    public static void main(String[] args) {
        int[][] m = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = m.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {


                int temp = m[i][j];
                m[i][j] = m[n - 1 - j][i];
                m[n - j - 1][i] = m[n - i - 1][n - j - 1];
                m[n - i - 1][n - j - 1] = m[j][n - i - 1];
                m[j][n - i - 1] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

}
