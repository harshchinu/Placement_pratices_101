import java.util.Scanner;

public class PaintTheWall {
    public static void main(String[] args) {

    /*    Scanner sc=new Scanner(System.in);

        int sizeofset=sc.nextInt();

        int set[]=new int[sizeofset];

        set[0]=sc.nextInt();
        int k=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();

        for(int i=1;i<set.length;i++){
            set[i]=((k*set[i-1]+b)%m)+1+set[i-1];
        }
*/



        int set[]= {1,2,4};
        int count =0;
        int a=4;
        int j=set.length-1;
        while (j>0){
            if(set[j]*set[j]>a){
                j--;
            }else {
                break;
            }
        }

        int mo=set.length-1;
        for(int i=0;i<=j;i++){
            count+=1;
            if(set[i]*set[mo]<a){
                mo--;
            }
            for(int l=i+1;l<=mo;l++){
                  if(set[i]*set[l]<=a) {
                            count += 2;
                    }
                }
            }


        System.out.println(count);

    }
}
