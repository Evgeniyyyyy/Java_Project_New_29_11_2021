package HW;

public class Task4_2 {
    //   public static void main(String[] Args) {


// Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

    /*        int a;
            int b;
            int result = 1;

            for (int i = 0; i <= b; i++) {
                result = result * a;
            }
            return result;
        }
    }*/
    public static void main(String[] args) {


        //   if (result < 1000 && result % 5 != 0) {


        for (int i = 1; i < 10000; i = i * 5) {
            System.out.println(i);
        }
    }
}




/*   String a = "red7";

        if (a.equals("green")){
            System.out.println("go");
        }
        else if (a.equals("red")){
            System.out.println("stop");
        }
        else {
            System.out.println("traffic light doesn't work");
        }*/
//1
//12
//123
//1234
        /*for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }*/

/*        Scanner scan = new Scanner(System.in);
        Boolean rain, sunny, snow;
        int temp;
        String activity = null;

        System.out.println("Please enter temperature: ");

        temp = scan.nextInt();

        if (temp <= -10 && temp <= 5) {
            System.out.println("It is snowy?");
            snow = scan.nextBoolean();


            if (snow) {
                activity = "make snowmen";
            } else {
                activity = "learn java";
            }
        } else if (temp >= 20 && temp <= 50) {
            System.out.println("It is sunny?");
            sunny = scan.nextBoolean();

            if (sunny) {
                activity = "fishing";

            } else {
                System.out.println("learn java2");
            }
        } else if (temp > 10 && temp < 20) {
            System.out.println("It is rainy?");
            rain = scan.nextBoolean();

            if (rain) {
                activity = "take umbrella";
            } else {
                System.out.println("learn java3");
            }
        } else {
            System.out.println("Please input valid temp: ");
            activity = "Unknown";
        }


        System.out.println("My activity: " + activity);


    }
}*/



