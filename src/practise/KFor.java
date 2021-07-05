package practise;

public class KFor {
    public static void main(String[] Args) {

        //   int beerCountBottles = 99;
        String bottlesOfBeer = " bottles of beer";
        String bottleOfBeerOnTheWall = " bottles of beer on the wall";
        String PrintStringOneBottle = " bottle of beer on the wall";
        String NoMoreBottles = "No more bottles of beer on the wall, no more bottles of beer. ";
        String GoToTheStore = "Go to the Store and buy some more, ";
        int bigValue = 99;
        for (int beerCountBottles = 99; beerCountBottles >= 0; beerCountBottles--) {
            if (beerCountBottles == 0) {
                PrintNoMoreBottles(NoMoreBottles);
                PrintGoToTheStore(GoToTheStore);
                PrintInt(bigValue);
                PrintString(bottleOfBeerOnTheWall);
                PrintDot();
            //    System.out.println(" 99 bottles of beer on the wall. ");
                System.out.println();
                //    break;
            } else if (beerCountBottles == 1) {
                PrintInt(beerCountBottles);
                PrintString(PrintStringOneBottle);
                PrintCommaSpace();

                //    System.out.print("Take one dawn and pass around, ");
                PrintTakeOneDown();
                System.out.println("no more bottle of beer on the wall");
                System.out.println();
                //    continue;
            } else if (beerCountBottles == 2) {
                PrintInt(beerCountBottles);
                PrintString(bottleOfBeerOnTheWall);
                PrintCommaSpace();
                PrintInt(beerCountBottles);
                PrintString(bottlesOfBeer);
                Print();
                PrintTakeOneDown();
                PrintIntOneFewer(beerCountBottles - 1);
                PrintString(PrintStringOneBottle);
                PrintDot();
                Print();
                Print();
                //    continue;
            } else {
                PrintInt(beerCountBottles);
                PrintString(bottleOfBeerOnTheWall);
                PrintCommaSpace();
                PrintInt(beerCountBottles);
                PrintString(bottlesOfBeer);
                PrintDot();
                Print();
                PrintTakeOneDown();
                PrintIntOneFewer(beerCountBottles - 1);
                PrintString(bottlesOfBeer);
                PrintDot();
                Print();
                Print();
            }


        }

    }

    private static void PrintTakeOneDown() {
        System.out.print("Take one dawn and pass around, ");
    }

    private static void PrintString(String string) {
        System.out.print(string);
    }

    private static void PrintStringOneBottle(String string) {
        System.out.print(string);
    }

    private static void PrintDot() {
        System.out.print(". ");
    }

    private static void PrintCommaSpace() {
        System.out.print(", ");
    }

    private static void Print() {
        System.out.println();
    }

    private static void PrintInt(int number) {
        System.out.print(number);
    }

    private static void PrintIntOneFewer(int number) {
        System.out.print(number);
    }

    private static void PrintOnTheWall(String str) {
        System.out.println(str);
    }

    private static void PrintNoMoreBottles(String str) {
        System.out.println(str);
    }

    private static void PrintGoToTheStore(String str) {
        System.out.print(str);
    }
}

