package shapes;

public class Circle {
    private double radius;
    static private int count =0;

    //constructor. There no circle without a radius.
    public Circle(double radius){
        this.radius = radius;
        count++; // everytime the Circle runs, a new circle is created
    }

    public static int getCount(){
        return count;
    }

    //this is a getter so we dont need parameters.
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2* Math.PI * radius;
    }
}

