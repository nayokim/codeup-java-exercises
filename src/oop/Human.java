package oop;

public class Human {
    public static final String planet = "earth";

    //fields
    private String name;
    private String email;
    private String address;

    //a method to get the name
    public String getName(){

        return this.name;
    }

    // constructor - gives objects properties
    public void setName(String aName){

        this.name = aName;
    }

    //method
    public String getEmail(){

        return email;
    }

    public void setEmail(String aEmail){

        this.email = aEmail;
    }

    public String getAddress(){

        return address;
    }

    public void setAddress(String aAddress){

        this.address = aAddress;
    }

    public boolean verify(String email){
        return email.contains("@");
    }

    public void sendMail(String to){
        if(this.verify(to)){
            System.out.println("sending email from " + this.email + " to " + to);
        }else{
            System.out.println("Wrong email format");
        }
    }

}
