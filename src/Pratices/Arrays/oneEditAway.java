package Pratices.Arrays;

public class oneEditAway {
    public static void main(String[] args) {
        String a ="pale";
        String b="bake";

        int count=longestcommonsubsequence(a,b,a.length(),b.length());
       // System.out.println(count);
        if(a.length()-count<=1){
            System.out.println(true);
        }else {
            System  .out.println(false);
        }
    }

    private static int longestcommonsubsequence(String a, String b, int i, int i1) {
        int t[][] = new int[i+1][i1+1];

            for(int j=1;j<t.length;j++){
                for(int k=1;k<t[0].length;k++){
                    if(a.charAt(j-1)==b.charAt(k-1)){
                        t[j][k]=1+t[j-1][k-1];
                    }else {
                        t[j][k]=Math.max(t[j-1][k],t[j][k-1]);
                    }
                }
            }


        return t[t.length-1][t[0].length-1];
    }
}
