import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class goldmansachpratice {
    public static void main(String[] args) {
        //groupanagramtogether();
       // squareinchessboard(8);

        //countingsort();

     //   uglyNumber(40);

        stockbuysell();
    }

    private static void stockbuysell() {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();

        while (test-->0){
            int size=sc.nextInt();
            int stockprice[] = new int[size];

            for(int i=0;i<size;i++){
                stockprice[i]=sc.nextInt();
            }

           ArrayList<Integer> arrayList = new ArrayList<>();
            int min=stockprice[0];
            int i=1;
            int currentprofit=0;
            while (i<stockprice.length-1){
                if(stockprice[i]>min){
                    currentprofit+=stockprice[i]-min;
                    min=stockprice[i];
                }




                i++;
            }
            System.out.println(arrayList.toString());
        }
    }

    private static void uglyNumber(int n) {

        /*int uglynumber[] = new int[n];
                int i2=0,i3=0,i5=0;

        int next2mul = 2;
        int next3mul = 3;
        int next5mul = 5;
        int next = 1;

        uglynumber[0]=1;

        for (int i=1; i<n; i++) {
            next = Math.min(next2mul, Math.min(next3mul, next5mul));
            uglynumber[i] = next;

            if (next == next2mul) {
                i2++;
                next2mul = uglynumber[i2]*2;
            }

            if (next == next3mul) {
                i3++;
                next3mul = uglynumber[i3]*3;
            }

            if (next == next5mul) {
                i5++;
                next5mul = uglynumber[i5]*5;
            }
        }

            System.out.println(next);*/

        ConcurrentHashMap<Integer,Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1,1);

            ArrayList<Integer> arrayList = new ArrayList<>();
             while (n>arrayList.size()) {
          /*  for (Integer i : hashMap.values()) {
                Integer integer = hashMap.get(i);
                arrayList.add(integer);
                hashMap.put(integer * 2, integer * 2);
                hashMap.put(integer * 3, integer * 3);
                hashMap.put(integer * 5, integer * 5);
            }*/


               //  Iterator it = hashMap.entrySet().iterator();

                 Iterator it = hashMap.entrySet().iterator();
                 while (it.hasNext()) {
                     Integer integer = (Integer) it.next();
                     arrayList.add(integer);
                     hashMap.put(integer * 2, integer * 2);
                     hashMap.put(integer * 3, integer * 3);
                     hashMap.put(integer * 5, integer * 5);
                     it.remove();
                 }
             }

             Collections.sort(arrayList);
             System.out.println(arrayList.toString());
             System.out.println(arrayList.get(n-3));


    }


    private static void countingsort() {
        int a[] ={7,3,8,1,0,2};
        int Min= Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]<Min){
                Min=a[i];
            }else if(a[i]>Max){
                Max=a[i];
            }
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();


        for(int i=0;i<=Max;i++){
            hashMap.put(i,0);

        }


        for(int i=0;i<a.length;i++){
           if(hashMap.containsKey(a[i])){
               Integer integr = hashMap.get(a[i]);
               hashMap.put(a[i],++integr);
           }

        }

        for(int i=0;i<hashMap.size();i++){
            Integer integer=hashMap.get(i);
            while (integer>0){
                System.out.println(i);
                integer--;
            }
        }

    }

    private static void squareinchessboard(int i) {

        int s=((i*(i+1)/2)*(2*i+1)/3);
        System.out.println(s);
    }

    private static void groupanagramtogether() {


        String[] sa = {"bat","design","toc","signed","cot","tab"};

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(int i=0;i<sa.length;i++){
            String s = sa[i];
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String newword = new String(c);

            if(hashMap.containsKey(newword)){
                hashMap.get(newword).add(s);
            }else {

                List<String> saa = new ArrayList<>();
                saa.add(s);
                hashMap.put(newword,saa);
            }


        }

        for (String s : hashMap.keySet()) {
            List<String> values = hashMap.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }

    }
}
