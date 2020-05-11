package oop;

public class SuperHero extends personLecture{

    private String alterEgo;

    public SuperHero(String firstName, String lastName,String alterEgo){
        super(firstName,lastName,true);
        this.alterEgo = alterEgo;
    }

    public String getFirstName(){
        return this.alterEgo;
    }

    public String getLastName(){
        return this.alterEgo;
    }

    public String getSecretIdentity(){
        return super.getFirstName() + " " + super.getLastName();

        //this will return superKid
        //return this.getFirstName() + " " + this.getLastName();
    }

}
