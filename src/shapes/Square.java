package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }


    void setLength(double length) {
    super.length = length;
    super.width= length;

    }

    void setWidth(double width) {
        super.length = length;
        super.width = width;
    }


    public double getPerimeter() {
        return (4 * super.length);
    }

    public double getArea() {
        return (super.width * super.width);
    }
}
