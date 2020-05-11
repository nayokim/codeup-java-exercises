package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    public void setLengthAndWidth(double width, double length){
        this.length=length;
        this.width= width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return ((2 *this.length) + (2 * this.width));
    }



}
