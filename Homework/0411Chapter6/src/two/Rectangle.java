package two;

public class Rectangle extends Shape {
    double length;
    double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void showArea() {
        double area = this.length * this.height;
        System.out.println("The Rectangle's area is :" + area);
    }
}
