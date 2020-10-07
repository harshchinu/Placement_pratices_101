import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s= scanner.nextLine();

        String[] sa = s.split(" ");
        boolean flag=false;
        int root= Integer.parseInt(sa[0]);
        int i=0;
        while ((2*i)+2<sa.length){
            if(sa[(2*1)+1].equals("N") || root>Integer.parseInt(sa[(2*i)+1])){
                root=(2*i)+1;
                flag=true;
            }else if(sa[(2*1)+2].equals("N") || root<Integer.parseInt(sa[(2*i)+2])){
                root=(2*i)+2;
                flag=true;
            }else {
                flag=false;
            }
            i++;
        }
        if(flag){
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }
}
