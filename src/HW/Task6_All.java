package HW;

import java.util.Locale;

public class Task6_All {
    public static void main(String[] Args) {
        // Task 1
        /*Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
                Для указанной строки ответ будет “ооооо” (или в столбик)*/

       /* String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {

        }
        System.out.println(s.charAt(10));
        System.out.println(s.charAt(19));
        System.out.println(s.charAt(30));
        System.out.println(s.charAt(32));*/

        // Task 2
       /* необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.*/
       /* String s = "Перевыборы выбранного президента";
        int countS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                countS++;
            }

        }
        System.out.println(countS);*/


        // Task 3
        /*String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.*/
        String s = "Посмотрите как Рите нравится ритм";
        String subS = "рит";

        for (int i = 0; i < s.length() - subS.length(); i++) {

            if (subS.equalsIgnoreCase(s.substring(i, i + subS.length()))) {

                System.out.println(i + ",");
            }

        }

    }
}


