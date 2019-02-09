package lesson7;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point point) {
        double distance = Math.sqrt(Math.pow(Math.abs(getX() - point.getX()), 2) + Math.pow(Math.abs(getY() - point.getY()), 2));
        return distance;
    }
}







