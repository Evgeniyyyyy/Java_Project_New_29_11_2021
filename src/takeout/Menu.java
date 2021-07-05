package takeout;

import static takeout.utils.PrintUtils.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;

import static takeout.utils.PrintUtils.PrintTitle.*;

public class Menu {
    final MainDish beef = new MainDish("Beef Wellington", 13.00);
    final MainDish fish = new MainDish("Miso Salmon", 12.00);
    final MainDish chicken = new MainDish("BChicken Teriacky", 7.00);
    final MainDish pork = new MainDish("Honey Pork Chois", 10.00);

    Side rice = new Side("Brown rice", 2.99);
    Side asparagus = new Side("Owen asparagus", 4.50);
    Side been = new Side("Green Beans", 5.00);
    Side potato = new Side("BCreamy Potato", 4.00);

    Drink drink = new Drink("Mineral water", 3.50);
    Drink wineWhite = new Drink("Oaked", 20.50);
    Drink wineRed = new Drink("Grand Cru", 3.50);
    Drink juiceApple = new Drink("Apple Juice", 3.50);

    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new Side[]{rice, asparagus, been, potato};
    Drink[] drinks = new Drink[]{drink, wineWhite, wineRed, juiceApple};

    public MainDish getBeef() {
        return beef;
    }

    /*public void setBeef(MainDish beef) {
        this.beef = beef;
    }*/

    public MainDish getFish() {
        return fish;
    }

   /*     public void setFish(MainDish fish) {
            this.fish = fish;
        }*/

    public MainDish getChicken() {
        return chicken;
    }

    /*public void setChicken(MainDish chicken) {
        this.chicken = chicken;
    }*/

    public MainDish getPork() {
        return pork;
    }

    /*public void setPork(MainDish pork) {
        this.pork = pork;
    }*/

    public Side getRice() {
        return rice;
    }

    public void setRice(Side rice) {
        this.rice = rice;
    }

    public Side getAsparagus() {
        return asparagus;
    }

    public void setAsparagus(Side asparagus) {
        this.asparagus = asparagus;
    }

    public Side getBeen() {
        return been;
    }

    public void setBeen(Side been) {
        this.been = been;
    }

    public Side getPotato() {
        return potato;
    }

    public void setPotato(Side potato) {
        this.potato = potato;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Drink getWineWhite() {
        return wineWhite;
    }

    public void setWineWhite(Drink wineWhite) {
        this.wineWhite = wineWhite;
    }

    public Drink getWineRed() {
        return wineRed;
    }

    public void setWineRed(Drink wineRed) {
        this.wineRed = wineRed;
    }

    public Drink getJuiceApple() {
        return juiceApple;
    }

    public void setJuiceApple(Drink juiceApple) {
        this.juiceApple = juiceApple;
    }

    // massive for name of Dishes
    public String[] getNameDishesNames() {

        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }

    /*public MainDish getBeef(){
        return beef;
    }*/



    // massive for Price of Dishes
    public double[] getPriceDishes() {
        double[] mainPriceNames = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainPriceNames[i] = mainDishes[i].getMainDishPrice();
        }
        return mainPriceNames;
    }


    // massive for name of Sides
    public String[] getSidesNames() {

        String[] SidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i++) {
            SidesNames[i] = sides[i].getSideNames();
        }
        return SidesNames;
    }

    // massive for Price of Sides

    public double[] getSidesPrice() {
        double[] SidesPrice = new double[sides.length];
        for (int i = 0; i < sides.length; i++) {
            SidesPrice[i] = sides[i].getSidePrice();
        }
        return SidesPrice;
    }

    // massive for name of Drinks

    public String[] getDrinkNames() {
        String[] DrinkNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            DrinkNames[i] = drinks[i].getDrinkName();
        }
        return DrinkNames;
    }

    // massive for Price of Drinks
    public double[] getDrinkPrice() {
        double[] DrinkPrice = new double[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            DrinkPrice[i] = drinks[i].getDrinkPrice();
        }
        return DrinkPrice;
    }

    String[] mainDishesNames = getNameDishesNames();
    double[] mainDishesPrices = getPriceDishes();

    private void PrintMainDishes() {
        printMainDishesTitle();
        for (int i = 0; i < getNameDishesNames().length; i++) {
            //print(mainDishesNames[i]);
            printPrice(mainDishesPrices[i]);
            println();

        }
        println();
    }


    private void printSides() {
        printSidesTitle();

        for (int i = 0; i < getSidesNames().length; i++) {
        //    print(getSidesNames()[i]);
            printPrice(getSidesPrice()[i]);
            println();

        }
        println();
    }

    private void printDrinks() {
        printDrinksTitle();
        for (int i = 0; i < getDrinkNames().length; i++) {
         //   print(getDrinkNames()[i]);
            printPrice(getDrinkPrice()[i]);
            println();

        }
        println();
    }

    public void PrintMenu() {
        printMenuTitle();
        PrintMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();
    }
}


