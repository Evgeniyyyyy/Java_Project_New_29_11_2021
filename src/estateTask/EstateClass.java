package estateTask;
/* Создать класс недвижимость и вкл след парам
сколько этажей
сколько помещ на этаже

 */

public class EstateClass {
    public static void main(String[] args) {
        Commercial commercial = new Commercial();
        commercial.buildingType();
        commercial.setNumberOfStores(98);
        commercial.setRoomsOnTheFloor(23);
        Owner owner = new Owner();
        owner.setLastName("Sam");

        System.out.println("Owner name: " + " " + owner.getLastName());
        System.out.println("Количество помещений: " + commercial.numberOfStores);
        System.out.println("Количество этажей: " + commercial.getRoomsOnTheFloor());
        System.out.println("______________________________________________________");

        Residential residential = new Residential();
        residential.buildingType();
        residential.setNumberOfStores(55);
        residential.setRoomsOnTheFloor(14);
        Owner owner1 = new Owner();
        owner1.setLastName("Kate");

        System.out.println("Owner1 name: " + " " + owner1.getLastName());
        System.out.println("Количество помещений: " + residential.numberOfStores);
        System.out.println("Количество этажей: " + residential.getRoomsOnTheFloor());

    }
}
