package shapes;

public class Square extends Rectangle{

    private double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        System.out.println("OVERRIDE");
        return (side * side);
    }

    public double getPerimeter(){
        System.out.println("OVERRIDE");
        return (4 * side);
    }

}
