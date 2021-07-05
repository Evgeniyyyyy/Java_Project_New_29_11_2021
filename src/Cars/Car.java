package Cars;

public class Car {
    String model; // instance field
    int year;  // instance field
    int mpg;  // instance field


    public Car(String model, int year, int mpg) {
        this.model = model;
        this.year = year;
        this.mpg = mpg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }


}
