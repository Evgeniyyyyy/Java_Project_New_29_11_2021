package HW.Task17_all;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1List {
    public static void main(String[] args) {

// create list and add some words
        List<String> createWords = new ArrayList<>();

        for (String word : "White Tan Yellow Orange Red Pink Purple Blue".split(" ")) {
            createWords.add(word);
        }
        System.out.println("list some words: " + createWords);

// delete words which contains letter L
        ArrayList<String> arr = new ArrayList<>();
        for (String word : "White Tan Yellow Orange Red Pink Purple Blue".split(" ")) {
            arr.add(word);
            for (int i = arr.size() - 1; i > 0; i--) {
                if (word.contains("l")) {
                    arr.remove(word);
                }
            }
        }
        System.out.println("Deleted words which consist letter l: " + arr);
    }
}


        /*public static ArrayList<String> fix(ArrayList <String> strings) {
            ArrayList<String> arr = new ArrayList<>();
            for (String word : "White Tan Yellow Orange Red Pink Purple Blue".split(" ")) {
                arr.add(word);
                for (int i = arr.size() - 1; i >= 0; i--) {
                    if (!word.contains("l")) {
                        arr.add(word);
                    }
                }*/

       /* for (Iterator<String> i = createWords.iterator(); i.hasNext();) {
            String str = i.next();
            boolean isL = str.contains("l");
            if (isL){
                .remove();
            }*/

/*
            }
            return arr;

        }*/


