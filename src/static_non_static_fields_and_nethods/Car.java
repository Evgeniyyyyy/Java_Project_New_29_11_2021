package static_non_static_fields_and_nethods;

public class Car {
    String model;
    int mpg;
    int year;

    public Car(String model, int mpg, int year) {
        this.model = model;
        this.mpg = mpg;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
