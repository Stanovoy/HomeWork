package lesson7;

public class Square extends Shape implements Perimetr {

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    double area() {
        double area = a * a;
        return area;
    }

    @Override
    public double perimetr() {
        return 0;
    }

    @Override
    public String toString() {
        return "Я квадрат";
    }

    @Override
    void print() {
        System.out.println(toString() + ". Моя площадь " + area() +
                ", мой периметр " + perimetr() + ".");
    }
}
