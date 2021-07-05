package practise;


public class STeacher {
    public static void main(String[] Args) {
        String comaSpace = ", ";
        String space = " ";
        String Line = "________";

        String firstName1 = "Maria Ivanovna";
        String lastName1 = "Petrova";
        int age1 = 35;
        String subject1 = "Literature";
        boolean isTeasher1 = true;
        boolean isStudent1 = false;
        String [] teach1 = new String[3];
        teach1 [0] = "Maria Ivanovna";
        teach1 [1] = "Petrova";
        teach1 [2] = "Literature";


        String firstName2 = "Ivan Petrovich";
        String lastName2 = "Ivanov";
        int age2 = 55;
        String subject2 = "Math";
        boolean isTeasher2 = true;
        boolean isStudent2 = false;
        String [] teach2 = new String[3];
        teach2 [0] = "Ivan Petrovich";
        teach2 [1] = "Ivanov";
        teach2 [2] = "Math";

        int [] teachAges = {35, 55, 30};
        String [] teachAgesStr = new String[3];
        for (int i = 0; i < teachAges.length; i++) {
            teachAgesStr [i] = String.valueOf(teachAges[i]);
            System.out.println(teachAgesStr[i]);
        }

        String[][] teacherSub = new String[3][3];
        for (int row = 0; row < teacherSub.length; row++ ) {
            for (int cell = 0; cell < teacherSub.length; cell++) {
                if (row == 0) {
                    teacherSub[row][cell] = teach1 [cell];
                }
                else if (row == 1) {
                    teacherSub [row][cell] = teach2 [cell];
                }
                else if (row == 2) {
                    teacherSub[row][cell] = teachAgesStr[cell];
                }
                System.out.println(teacherSub[row][cell]);
            }
        }

        for (int cell = 0; cell < teacherSub.length; cell++) {
            for (int row = 0; row < teacherSub.length; row++) {
                System.out.println(teacherSub[row][cell]);
            }
            System.out.println("______________");
        }

        /*if (firstName1 == "Maria Ivanovna")
        {
            System.out.println(firstName1 + space + lastName1 + comaSpace + age1 + comaSpace + subject1);
        }
       else if (firstName2 == "IvanPetrovich") {
            System.out.println(firstName2 + " " + lastName2 + comaSpace + age2 + comaSpace + subject2);
        }
        else {
            System.out.println("ERROR");
            //   System.out.println(firstName2 + " " + lastName2 + comaSpace + age2 + comaSpace + subject2);
        }*/
        //    System.out.println(firstName1 + space + lastName1 + comaSpace + age1 + comaSpace + subject1);
        //    System.out.println(firstName2 + " " + lastName2 + comaSpace + age2 + comaSpace + subject2);

    }
}


