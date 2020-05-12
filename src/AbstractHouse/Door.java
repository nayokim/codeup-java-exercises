package AbstractHouse;

public class Door implements Switchable{
    private String type;
    private boolean isOpen = false;

    public Door(String type){
        this.type = type;
    }

    public boolean getState() {
        return isOpen;
    }

    public void switchOn() {
        System.out.println("Door " + this.type+ " is being opened");
        this.isOpen= true;
    }

    public void switchOff() {
        System.out.println("Door " + this.type+ " is being closed");

        this.isOpen=false;
    }

}
