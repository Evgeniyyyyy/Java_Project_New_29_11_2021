package static_non_static_fields_and_nethods;

public class FleetUtils {
    public static void prentFleetData(Car[]fleet){
        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].getModel() + " " + fleet[i].getYear());

        }
    }

    public static double printFuel(Car[]fleet, int milestones, double fuelPerGalon){
        int cost = 0;
        for (int i = 0; i < fleet.length; i++) {
             cost += milestones / fleet[i].getMpg() * fuelPerGalon;

        }
        return cost;
    }

}
