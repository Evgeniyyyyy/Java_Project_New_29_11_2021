package HW.Task10_all;

public class MonthUtils {
    // Создать класс MonthUtils
    //    который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month)

    public final static Month JAN = new Month("Jun", 31, 24);
    public final static Month FEB = new Month("Feb", 28, 21);
    public final static Month MAR = new Month("Mar", 30, 23);

    public static Month[] Q1 = new Month[] {JAN, FEB, MAR};

    public static Month[] getQ1(){
        return new Month[]{JAN, FEB, MAR};

    }







}
