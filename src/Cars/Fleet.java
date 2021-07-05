package Cars;

import javax.sound.midi.Soundbank;

public class Fleet {
    public static void main(String[] args) {
        Car camry = new Car("Camry", 2021, 32);
        Car corolla = new Car("Corolla", 2020, 21);
        Car tucson = new Car("Tucson", 2015, 25);
        Car prius = new Car("Prius", 2017, 27);

        Car fleet[] = {camry, corolla, tucson, prius};

        FleetUtils.printFleetData(fleet);
        System.out.println();
        double avgAge = FleetUtils.getAverageAge(fleet);
        System.out.println("Average Age Sar: " + avgAge);
        double priceFuell = FleetUtils.getFuelCost(fleet, 2000);
        System.out.println("Get Fuel Cost per distance: $" + priceFuell);


        /*System.out.println(camry.getModel() + " " + camry.getYear());
        System.out.println(corolla.getModel() + " " + corolla.getYear());
        System.out.println(tucson.getModel() + " " + tucson.getYear());
        System.out.println(prius.getModel() + " " + prius.getYear());*/


    }


}
