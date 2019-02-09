package lesson7;

public class Demo {
    public static void main(String[] args) {
        Point centrePoint = new Point(0, 0);
        Point circlePoint = new Point(0, 2);

        Shape shape = new Circle(centrePoint, circlePoint);
        shape.print();

    /*Сравнение площади фигур*/
        System.out.println(compare(new Square(6), new Rectangle(9, 4)));
    }

    public static void print(Shape ref) {
        ref.print();
    }

    public static boolean compare(Shape ref, Shape ref1) {
        return (ref.area() == ref1.area());
    }
}




