package Cars;



public class FleetUtils {

    static double PRICE_FUEL = 7.3;
    public static void printFleetData(Car[] fleet) {
        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].getModel() + " " + fleet[i].getYear());
        }
    }

    public static double getAverageAge(Car[] fleet) {
        int ageSum = 0;
        for (int i = 0; i < fleet.length; i++) {
            ageSum += 2021 - fleet[i].getYear();
        }

        double result = (double) ageSum / fleet.length;
        return result;
    }

    public static double getFuelCost(Car[] fleet, int milliage) {
        int cost = 0;
        for (int i = 0; i < fleet.length; i++) {
            cost += milliage / fleet[i].getMpg() * PRICE_FUEL;

        }
        return cost;
    }
}
