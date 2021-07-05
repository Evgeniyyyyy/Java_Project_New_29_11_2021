package takeout;

public final class Drink {
    public final String drinkName;
    public final double drinkPrice;

    Drink(String name, double price){
        this.drinkName = name;
        this.drinkPrice = price;
    }

    public String getDrinkName() {
        return drinkName;
    }


    public double getDrinkPrice() {
        return drinkPrice;
    }


}
