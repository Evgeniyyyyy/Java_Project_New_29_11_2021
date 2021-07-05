package HW.Task10_all;

public class Month {
    /*Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.*/
    String nameMonth;
    int days;
    int workDays;


    public Month(String nameMonth, int days, int workDays) {
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


