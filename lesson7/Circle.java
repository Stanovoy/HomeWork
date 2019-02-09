package lesson7;

public class Circle extends Shape implements Perimetr {
    private Point centrePoint;
    private Point circlePoint;
    private final double PI = 3.14;

    public Circle(Point centrePoint, Point circlePoint) {
        this.centrePoint = centrePoint;
        this.circlePoint = circlePoint;
    }

    public double radius() {
        double radius = centrePoint.distance(circlePoint);
        return radius;
    }

    @Override
    double area() {
        double area = PI * (Math.pow(radius(), 2)) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Я oкружность";
    }

    @Override
    void print() {
        System.out.println(toString() + ". Моя площадь " + area() +
                ", длина моей окружности " + perimetr() + ", мой радиус " + radius() + ".");

    }

    @Override
    public double perimetr() {
        double perimetr = 2 * PI * radius();
        return perimetr;
    }
}
