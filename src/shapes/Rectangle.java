package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    void setLength(double length) {
       super.length = length;
    }


    void setWidth(double width) {
        super.width= width;

    }

    public double getPerimeter() {
        return ((2 * super.length) + (2 * super.width));
    }

    public double getArea() {
        return (super.length * super.width);
    }
}
