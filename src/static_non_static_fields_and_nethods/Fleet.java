package static_non_static_fields_and_nethods;

public class Fleet {
    public static void main(String[] args) {
        Car camry = new Car("Camry", 30, 2021);
        Car corolla = new Car("corolla", 25, 2015);
        Car tundra = new Car("tundra", 38, 2020);

        Car[] fleet = {camry, corolla, tundra};

        FleetUtils.prentFleetData(fleet);

        double result = FleetUtils.printFuel(fleet, 350, 3.75);

        System.out.println("Fuel cost $: " + result);


    }
}
