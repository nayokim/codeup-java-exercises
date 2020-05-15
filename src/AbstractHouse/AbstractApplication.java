package AbstractHouse;

public class AbstractApplication {
    public static void main(String[] args) {

        Door[] doors = {new Door("standard")};
        Light[] lights = {new Light("fixture"), new Light("lamp")};

        Door[] doorsSecondBedroom = {new Door("standard")};
        Light[] lightsSecondBedroom = {new Light("fixture")};

        Room [] rooms = {new Bedroom(15, 25, doors, lights, true),
                new Bedroom(10, 15, doorsSecondBedroom, lightsSecondBedroom, false)
        };

        House smallHouse = new House("123 Cool Address","Slab",rooms );
        System.out.println("The house is " + smallHouse.getSquareFeet() + " sqft");
        smallHouse.switchEverythingOff();

        smallHouse.switchEverythingOn();
    }
}
