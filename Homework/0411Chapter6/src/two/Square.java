package two;

public class Square extends Shape {
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void showArea() {
        double area = this.length * this.length;
        System.out.println("The Square's area is :" + area);
    }
}
