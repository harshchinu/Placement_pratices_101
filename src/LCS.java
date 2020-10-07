import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class LCS {
   static int sum=0;
   static HashMap<String,Integer> hashMap = new HashMap<>();
    public static void main(String[] args) {
        String x= "AGGTAB";
        String y="GXTXAYB";

      /*  int c=lcs(x,y,0,0);

        int ca=lcstd(x,y,x.length(),y.length());
        System.out.println(c);
        System.out.println(ca);

        int caa=longestcommonsubstring(x,y,x.length(),y.length());
        System.out.println(caa);*/
        
     //   String s= longestcommonsequenceString(x,y,x.length(),y.length());
      //  System.out.println(s);

            //minimunumerofiandd("heap","pea");

        String a="dvdev";
        HashSet<Character> hashSet= new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(!hashSet.contains(a.charAt(i))){
                stringBuilder.append(a.charAt(i));
            }
           hashSet.add(a.charAt(i));
        }

        System.out.println(stringBuilder.toString());

       // System.out.println(hashSet.toString());

        int c= longestcommonsubstring(a,stringBuilder.toString(),a.length(),stringBuilder.length());
        System.out.println(c);


    }

    private static void minimunumerofiandd(String heap, String pea) {
        int t[][] = new int[heap.length()+1][pea.length()+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(heap.charAt(i-1)==pea.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

           int deletion = heap.length()-t[t.length - 1][t[0].length-1];


    /*    Stack<Character> strings = new Stack<>();
        int i=heap.length(),j=pea.length();
        while (i>1 || j>1) {
            if (heap.charAt(i - 1) == pea.charAt(j - 1)) {
                //  System.out.println(x.charAt(i-1));
                strings.push(heap.charAt(i-1));
                i--;
                j--;
            } else {
                if (t[i - 1][j] == t[i][j]) {
                    i = i - 1;
                } else if (t[i][j - 1] == t[i][j]) {
                    j = j - 1;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!strings.isEmpty()){
            stringBuilder.append(strings.pop());
        }*/

       //int diff = lcstd(stringBuilder.toString(),pea,stringBuilder.length(),pea.length());

      //  int insertion=pea.length()-diff;

        int insertion=pea.length()-deletion;

       // System.out.println(diff);
        System.out.println(deletion);
        System.out.println(insertion);
    }

    private static String longestcommonsequenceString(String x, String y, int length, int length1) {
        int t[][] = new int[length+1][length1+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        Stack<Character> strings = new Stack<>();
        int i=x.length(),j=y.length();
        while (i>1 || j>1) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
              //  System.out.println(x.charAt(i-1));
                strings.push(x.charAt(i-1));
                i--;
                j--;
            } else {
                if (t[i - 1][j] == t[i][j]) {
                    i = i - 1;
                } else if (t[i][j - 1] == t[i][j]) {
                    j = j - 1;
                }
            }
        }

       StringBuilder stringBuilder = new StringBuilder();

        while (!strings.isEmpty()){
            stringBuilder.append(strings.pop());
        }
        return stringBuilder.toString();
    }

    private static int longestcommonsubstring(String x, String y, int length, int length1) {
        int t[][] = new int[length+1][length1+1];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    if(t[i][j]>max){
                        max=t[i][j];
                    }
                }else {
                    t[i][j]=0;
                }
            }
        }

       return max;
    }

    private static int lcstd(String x, String y, int length, int length1) {

        int t[][] = new int[length+1][length1+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[t.length-1][t[0].length-1];
    }

    private static int lcs(String x, String y, int length, int length1) {


        if(length==x.length() || length1==y.length()){
            return 0;
        }

        String key = x+"|"+y+"|"+length+"|"+length1;


        if(x.charAt(length)==y.charAt(length1)) {
            hashMap.put(key,1 + lcs(x, y, length + 1, length1 + 1));
            return hashMap.get(key);
        }


        if(hashMap.containsKey(key)) {
            return hashMap.get(key);
        }else {
           hashMap.put(key,Math.max(lcs(x, y, length, length1 + 1), lcs(x, y, length + 1, length1)));
           return hashMap.get(key);
        }
    }
}
