package Pratices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  Scanner s = new Scanner(System.in);
        long size = Long.parseLong(br.readLine());
        ArrayList<Long> arr = new ArrayList<>();

        String arraya = br.readLine();

        String arrry[] = arraya.split(" ");

        for (int i = 0; i < arrry.length; i++) {
            arr.add(Long.parseLong(arrry[i]));
        }

        Long queries = Long.parseLong(br.readLine());

        long total = (size / 2);
        total += (size - total);
        total += size;

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i <= size; i++) {
            hashMap.put(i, false);
        }


        long oddlength = 0;
        long evenlength = 0;
        if (size % 2 == 0) {
            evenlength = size;
            oddlength = size - 1;
        } else {
            evenlength = size - 1;
            oddlength = size;
        }


        while (queries-- > 0) {
            int o = 1, e = 2;

            String queriesa = br.readLine();
            String[] aa = queriesa.split(" ");
            long time = Long.parseLong(aa[0]);

            int element = (int) Long.parseLong(aa[1]);

            long remainingcycle = time % total;

            long div = remainingcycle / (total - size);
            long dvia = remainingcycle % (total - size);
            if (div == 0) {
                while (dvia-- > 0) {
                    if (o <= oddlength) {
                        hashMap.put(o - 1, true);
                        o += 2;
                    } else if (e <= evenlength) {
                        hashMap.put(e - 1, true);
                        e += 2;
                    }
                }
      /*          if(hashMap.get())
            }else{
                manipulated.clear();
                for(int i=0;i<arr.size();i++){
                    manipulated.add(i, (long) 0);
                }
                while (dvia-->0){
                    if(o<=oddlength){
                        manipulated.set(o-1,arr.get(o-1));
                        o+=2;
                    }else if(e<=evenlength){
                        manipulated.set(e-1,arr.get(e-1));
                        e+=2;
                    }
                }
                System.out.println(manipulated.get(element));
                }
            }

        }*/
            }
        }
    }
}
