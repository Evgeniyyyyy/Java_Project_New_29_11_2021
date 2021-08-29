package HW.Task10_all;

public class MonthUtils {


    private static class MonthImp implements IMonth {
        /*Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.*/
        private String nameMonth;
        private int days;
        private int workDays;

        public MonthImp(String nameMonth, int days, int workDays) {
            this.nameMonth = nameMonth;
            this.days = days;
            this.workDays = workDays;

        }

        public String getNameMonth() {
            return nameMonth;
        }

        public int getDays() {
            return days;
        }

        public int getWorkDays() {
            return workDays;
        }
    }
        // Создать класс MonthUtils
        //    который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month)

        public static final IMonth JAN = new MonthImp("Jun", 31, 24);
        public static final IMonth FEB = new MonthImp("Feb", 28, 21);
        public static final IMonth MAR = new MonthImp("Mar", 30, 23);

            public static IMonth[] Q1 = new IMonth[]{JAN, FEB, MAR};

        public static IMonth[] getQ1() {
            return new IMonth[]{JAN, FEB, MAR};

        }
    }



