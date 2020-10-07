public class Solution {




    public static void main(String[] args) {

      //  int vl[] = {100,100,120},wt[]={10,20,30},w=50;
//        knapsack01(vl,wt,w);

      //  int arr[]={1,5,5,11},sum=11;
        //subsetsum(arr,sum);

       /* boolean a=equalSumPartiton(arr,sum);
        System.out.println(a);*/


        //int c=countSubset(arr,sum);
        //System.out.println(c);

    //    int arr[]={1,2,7};
    //    int c=minimunsubsetdifference(arr);
//        System.out.println(c);

/*
        int arr[] = {1,1,2,3};
        int c=countminsubsetdiff(arr,1);
        System.out.println(c);*/


      /*  int arr[]={1,5,8,9,10,17,17,20};
        int c=cuttingrod(arr,8);
        System.out.println(c);*/

      /*  int arr[] = {1,2,3};
        int c=coutmakingchange(arr,5);
        System.out.println(c);*/

        int arr[]={1,2,3};
        int c=minimunnumberofcoint(arr,5);
        System.out.println(c);


    }

    private static int minimunnumberofcoint(int[] arr, int sum) {

        int t[][]=new int[arr.length+1][sum+1];

      /*  for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0){
                    t[i][j]=Integer.MAX_VALUE;

                }

                if(i==1 && j==0){
                    t[i][j]=0;
                }

            }
        }*/

        for(int j = 0; j <= sum; j++){
            t[0][j] = Integer.MAX_VALUE;
        }

        // Initialising first column with 0
        for(int i = 1; i <= arr.length; i++){
            t[i][0] = 0;
        }



/*        for(int i=1,j=1;j<t[0].length;j++){
            if(arr[i]%j==0){
                t[i][j]=1;
            }else {
                t[i][j]=Integer.MAX_VALUE;
            }

        }*/

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                int curentelemt=arr[i-1];
                if(curentelemt<=j){
                    t[i][j]=Math.min(1+t[i][j-curentelemt],t[i-1][j]);
                }else {
                    t[i][j]=t[i-1][j];
                }

            }
        }


        return t[t.length-1][t[0].length-1];
    }

    private static int coutmakingchange(int[] arr,int sum) {

       /* int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }*/

        int t[][]=new int[arr.length+1][sum+1];


        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){

                if(i==0){
                    t[i][j]=0;
                }


                if(j==0){
                    t[i][j]=1;
                }

            }
        }

        t[0][0]=1;


        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                int currentcount=arr[i-1];

                if(currentcount<=j){
                    t[i][j]=t[i][j-currentcount]+t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }

            }
        }


        return t[t.length-1][t[0].length-1];

    }

    private static int cuttingrod(int[] arr, int size) {

        //assuming the size of all cut is 1 if its different then also it same 0 1 knapsack

        int wt[]=new int[size+1];
        for (int i =1;i<size;i++){
            wt[i]=i;
        }
        int t[][]=new int[size+1][size+1];

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(arr[i-1]<=j){
                    t[i][j]=Math.max(arr[i-1]+t[i][j-wt[i-1]],t[i-1][j]);
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[t.length-1][t[0].length-1];
    }

    private static int countminsubsetdiff(int[] arr, int diff) {
        int totatsum=0;

        for(int i=0;i<arr.length;i++){
            totatsum+=arr[i];
        }


        System.out.println(totatsum);
        int s1=(totatsum+diff)/2;




        int t[][] =new int[arr.length+1][s1+1];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++) {
                if(j==0){
                    t[i][j]=1;
                }
            }
            }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                int currentValue=arr[i-1];
                if(currentValue<=j){
                    t[i][j]=t[i-1][j-currentValue]+t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[t.length-1][t[0].length-1];
    }

    private static int minimunsubsetdifference(int[] arr) {

        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        boolean t[][] = new boolean[arr.length+1][sum+1];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if (j == 0) {
                    t[i][j]=true;
                }
                if(i==0){
                    t[i][j]=false;
                }
            }
        }
        t[0][0]=true;

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){

                int currentelement=arr[i-1];
                if(currentelement<=j){
                    t[i][j]=t[i-1][j-currentelement] || t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }


        int diff=Integer.MAX_VALUE;

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
             System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }


        for(int j=sum/2;j>=0;j--){
            int i=arr.length;
            if(t[i][j]==true){
                diff=sum-2*j;
                break;
            }
        }
        return diff;
    }



    private static int countSubset(int[] arr, int sum) {
        int t[][] = new int[arr.length+1][sum];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(j==0){
                    t[i][j]=1;
                }
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                int curretSum=arr[i-1];
                if(curretSum<=j){
                    t[i][j]=t[i-1][j-curretSum]+t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[t.length-1][t[0].length-1];

    }

    private static boolean equalSumPartiton(int[] arr, int sum) {

        int Asum=0;

        for(int i=0;i<arr.length;i++){
            Asum+=arr[i];
        }

        if(Asum%2==0){
            return subsetsum(arr,sum/2);
        }else {
            return false;
        }



    }

    private static boolean subsetsum(int[] arr, int sum) {
        boolean t[][] = new boolean[arr.length+1][sum+1];

        for(int i=0;i<t.length;i++){
          for(int j=0;j<t[0].length;j++){
              if (j == 0) {
                  t[i][j]=true;
              }
              if(i==0){
                  t[i][j]=false;
              }
          }
        }
        t[0][0]=true;

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){

                int currentelement=arr[i-1];
                if(currentelement<=j){
                    t[i][j]=t[i-1][j-currentelement] || t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }


        return t[t.length-1][t[0].length-1];


    }


    private static void knapsack01(int[] vl, int[] wt, int w) {
        int t[][] =new int [wt.length+1][w+1];

        /*for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){

                if(i==0|| j==0 ){
                    t[i][j]=0;
                }

                }
        }*/

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){

                if (wt[i-1] <= j) {
                    t[i][j]=Math.max(vl[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }else {
                    t[i][j]=t[i-1][j];
                }

            }
        }

        System.out.println(t[t.length-1][t[0].length-1 ]);
    }


}
