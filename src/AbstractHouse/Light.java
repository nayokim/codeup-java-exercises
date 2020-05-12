package AbstractHouse;

public class Light implements Switchable {
    private String type;
    private boolean isOn = false;

    public Light(String type){
        this.type = type;
    }


    public boolean getState() {
        return isOn;
    }

    public void switchOn() {
        System.out.println("light " + this.type+ " is being switched on");
        this.isOn= true;
    }

    public void switchOff() {
        System.out.println("light " + this.type+ " is being switched off");

        this.isOn=false;
    }
}
