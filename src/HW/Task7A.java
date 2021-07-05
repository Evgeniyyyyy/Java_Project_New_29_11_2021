package HW;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task7A {

    public static void main(String[] args) {


        //    public static String MakeUpperCase (String str){
        String str = "abba";
        String str1 = "abu dabi";
        str.toUpperCase();
        //   return str;
        System.out.println(str);

        // delete first and lact char in the string
        str = str.substring(1, str.length() - 1);
        System.out.println(str);

       // delete spaces
        str1 = str1.replaceAll(" ", "");
        System.out.println(str1);

        /*"green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));*/
        /*String current = "green";
        if (current == "green") {
            return "yellow";
        }
        else if (current == "yellow") {
            return "red";
        }
        else {
            return "green";
        }*/

        // new 10 times repeat
        String input;// = "original";
        String newStr = "new"; //new string to be added
        int n = 10; // no of times we want to add
        input = new String(new char[n]).replace("\0", newStr);
        System.out.println(input);


    }
}

