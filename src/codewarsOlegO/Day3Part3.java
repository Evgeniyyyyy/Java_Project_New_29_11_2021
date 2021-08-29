package codewarsOlegO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3Part3 {
    //English Twist or Japanese Classic codewars
    public static List<String> theGame(List<String> words){
        List<String> result = new ArrayList<>();
        if (words.size() == 0 || words.get(0).equals("")){
            return result;
        }
        result.add(words.get(0));
        for (int i = 1; i < words.size() - 1; i++) {
            String prev = words.get(i - 1);
            String cur = words.get(i);
            if (cur.equals("")){
                break;
            }
            if (cur.charAt(0) == prev.charAt(prev.length() - 1)){
                result.add(cur);
            }
            else {
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(theGame (new ArrayList<String>(Arrays.asList("dog", "goose", "tiger", "cat"))));
    }
}
