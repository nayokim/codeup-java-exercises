package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
//        Circle circle = new Circle(input.getDouble());
        //bonus
//        Circle secondCircle = new Circle(input.getDouble());
        Circle aCircle;
//        System.out.println(Circle.getCount());
//        System.out.println(circle.getArea());
//        System.out.println(circle.getCircumference());

        while(input.yesNo()){//while the yesNo is true

            aCircle = new Circle(input.getDouble());
            System.out.println("aCircl.getArea()= " + aCircle.getArea() );
            System.out.println("aCircl.getArea()= " + aCircle.getCircumference() );

        }
        System.out.println("Circle.getCount() = " + Circle.getCount());
    }
}
