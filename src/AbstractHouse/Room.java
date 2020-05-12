package AbstractHouse;

import shapes.Rectangle;

public abstract class Room extends Rectangle {

    private Door[] doors;
    private Light[] lights;

    public Room(double length, double width,Door[] doors, Light[] lights) {
        super(length, width);
        this.doors = doors;
        this.lights = lights;
    }

    public void switchEverythingOn(){
        //open all the doors
        for (Switchable item : doors){
            item.switchOn();
        }
        //turn on all the lights
        for (Switchable item: lights){
            item.switchOn();
        }
    }

    public void switchEverythingOff(){
        //open all the doors
        for (Switchable item : doors){
            item.switchOff();
        }

        //turn on all the lights
        for (Switchable item: lights){
            item.switchOff();
        }
    }


}
