package practise;

public class BString {
    public static void main(String[] Args)
    {
      /*  Boolean bT = true;
        Boolean bF = false;

        boolean a = true;
        boolean c = false;
    bT.toString();*/
// вывести положение буквы в строке
       /*String str = "yevhen";

       for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == 'v') {
               System.out.println(i);
           }
          // System.out.println(i);
       }*/

        String str1 = "Yevhen";
        //просто поменть буквы
    //    String str2 = str1.replace('e', 'W');
    //    System.out.println(str2);

        // поменять первую букву
        String str3 = str1.replaceFirst("e", "s");
        System.out.println(str3);
    }
}
