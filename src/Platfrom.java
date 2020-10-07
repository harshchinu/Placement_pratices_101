import java.util.Arrays;
import java.util.Scanner;

public class Platfrom {

    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

    while (i < n && j < n) {


            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }


            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }


            if (plat_needed > result)
                result = plat_needed;
        }

        return result;
    }


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        int dep[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
            dep[i]=scanner.nextInt();
            dep[i]+=arr[i];
        }
        System.out.println(findPlatform(arr,dep,size));
    }
}


