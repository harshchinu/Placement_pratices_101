package Pratices;

import javax.xml.transform.Result;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Fillthetrucks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int boxesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> boxes = IntStream.range(0, boxesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        int unitsPerBoxCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> unitsPerBox = IntStream.range(0, unitsPerBoxCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        long truckSize = Long.parseLong(bufferedReader.readLine().trim());

        long result =getMaxUnits(boxes, unitsPerBox, truckSize);

     /*   bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/

        bufferedReader.close();
      //  bufferedWriter.close();

        System.out.println("result"+result);

    }

    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        // Write your code here

        Collections.sort(unitsPerBox, Collections.reverseOrder());

        long max=0;

        int size=0;
        for(int i=0;i<boxes.size();i++){
            Long box=boxes.get(i);

            while(box>0){
                max+=unitsPerBox.get(i);
                box--;
                size++;
                if(size==truckSize){
                    return max;
                }
            }

        }

        return max;

    }
}
