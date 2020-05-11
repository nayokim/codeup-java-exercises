package shapes;

public class Square extends Rectangle{

//    private double side;

    public Square(double side){
//        new Rectangle(1,2);
        super(side, side);
//        this.side = side;
    }

//    public void setSide(double side){
//        this.side = side;
//    }

    //encapsulation

    public double getArea(){
        System.out.println("OVERRIDE");
        return Math.pow(super.width,2);
//        return (Math.pow(side,2));
    }

    public double getPerimeter(){
        System.out.println("OVERRIDE");
        return (4 * (super.length));
//        return (4 * side);
    }

}
