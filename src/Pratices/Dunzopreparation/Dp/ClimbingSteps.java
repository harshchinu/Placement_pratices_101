package Pratices.Dunzopreparation.Dp;

public class ClimbingSteps {
    public static void main(String[] args) {
        int n=numbersofWaytoClimb(8);
        System.out.println(n);
    }

    private static int numbersofWaytoClimb(int n) {
        int a[]=new int[n+1];

        a[1]=1;
        a[3]=1;
        a[5]=1;

        for(int i=0;i<n-4;i++){
            a[i+1]=a[i+1]+a[i];
            a[i+3]=a[i+3]+a[i];
            a[i+5]=a[i+5]+a[i];
        }
        return a[n-1];
    }
}
