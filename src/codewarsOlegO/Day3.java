package codewarsOlegO;

import java.util.Arrays;
import java.util.Comparator;

public class Day3 {
    private static int longestWord(String str) {
        // one case search word with max letters and count it via for()
        String[] spl = str.split(" ");
    /*    int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;*/
        // two case search word with max letters and count it ()sort
        Arrays.sort(spl, Comparator.comparing(String::length).reversed());
        return spl[0].length();

    }

    public static void main(String[] args) {
        System.out.println(longestWord("One, Twoo, Fives"));
    }
}
