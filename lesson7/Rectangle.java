package lesson7;

public class Rectangle extends Square implements Perimetr {
    double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    double area() {
        double area = a * b;
        return area;
    }

    @Override
    public String toString() {
        return "Я прямоугольник";
    }

    @Override
    void print() {
        System.out.println(toString() + ". Моя площадь " + area() +
                ", мой периметр " + perimetr() + ", моя диагональ " + diagonale() + ".");
    }

    @Override
    public double perimetr() {
        double perimetr = (a + b) * 2;
        return perimetr;
    }

    private double diagonale() {
        double diagonale = Math.sqrt(Math.pow((a), 2) + Math.pow((b), 2));
        return diagonale;
    }
}
