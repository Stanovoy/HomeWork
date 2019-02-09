package lesson6;

public class PointDemo {
    public static void main(String[] args) {

        Point point1 = new Point(-1, -1);
        Point point2 = new Point(1, 1);
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Диагональ прямоугольника: " + (rectangle.diagonal(point1, point2)));
        System.out.println("Площадь прямоугольника: " + (rectangle.square(point1, point2)));
    }
}
