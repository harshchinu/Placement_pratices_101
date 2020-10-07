import java.util.*;
import java.io.*;
class Constellation {
    public static void main(String[] args) throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        char a[][] = new char[3][size];

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            int k=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)!=' ')
                    a[i][k++] = s.charAt(j);
            }
        }


        for (int j= 0; j < size - 2; j++) {

            if(a[0][j]=='#')
                System.out.print("#");

            if(a[0][j]=='.' && a[0][j+1]=='*' && a[0][j+2]=='.' && a[1][j]=='*' && a[1][j+1]=='*' && a[1][j+2]=='*' && a[2][j]=='*' && a[2][j+1]=='.' && a[2][j+2]=='*')
            {
                System.out.print("A");
                j=j+2;
            }

            if(a[0][j]=='*' && a[0][j+1]=='.' && a[0][j+2]=='*' && a[1][j]=='*' && a[1][j+1]=='.' && a[1][j+2]=='*' && a[2][j]=='*' && a[2][j+1]=='*' && a[2][j+2]=='*')
            {
                System.out.print("U");
                j=j+2;
            }

            if(a[0][j]=='*' && a[0][j+1]=='*' && a[0][j+2]=='*' && a[2][j]=='*' && a[2][j+1]=='*' && a[2][j+2]=='*')
            {
                if(a[1][j]=='*' && a[1][j+1]=='*' && a[1][j+2]=='*')
                {
                    System.out.print("E");
                    j=j+2;
                }

                if(a[1][j]=='.' && a[1][j+1]=='*' && a[1][j+2]=='.')
                {
                    System.out.print("I");
                    j=j+2;
                }

                if(a[1][j]=='*' && a[1][j+1]=='.' && a[1][j+2]=='*')
                {
                    System.out.print("O");
                    j=j+2;
                }
            }
        }


    }
}
