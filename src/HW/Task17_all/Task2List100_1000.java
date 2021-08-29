package HW.Task17_all;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2List100_1000 {
    public static void main(String[] args) {
// created list range 100-1000
        List<Integer> range = IntStream.rangeClosed(100, 1000)
                .boxed().collect(Collectors.toList());
        System.out.println(range);
       //delete all odd values
        for (int i = range.size(); --i >= 0;) {
            if (range.get(i) % 2 == 0){
                range.remove(i);

            }

        }
        System.out.println(range);
    }
    // перегрузка метода remove если нам нужно привести к Integer и приведение метода к int
       /* for (Integer i = range.size(); --i >= 0;) {
        if (range.get(i) % 2 == 0){
            range.remove(i.intValue());*/
}
