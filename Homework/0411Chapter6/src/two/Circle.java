package two;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void showArea() {
        double area = Math.PI * r * r;
        System.out.println("The Circle's area is :" + area);
    }
}
