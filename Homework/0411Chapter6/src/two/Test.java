package two;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(6);
        Circle circle = new Circle(6);
        rectangle.showArea();
        square.showArea();
        circle.showArea();
    }
}
