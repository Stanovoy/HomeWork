package lesson6;

public class Rectangle {

    private Point leftUpPoint;
    private Point rightLowPoint;

    public Rectangle(Point leftUpPoint, Point rightLowPoint) {
        this.leftUpPoint = leftUpPoint;
        this.rightLowPoint = rightLowPoint;
    }
    public double square(Point leftUpPoint, Point rightLowPoint) {
        double square = Math.abs(leftUpPoint.getX() - rightLowPoint.getX()) * Math.abs(leftUpPoint.getY() - rightLowPoint.getY());
        return square;
    }
    public double diagonal(Point leftUpPoint, Point rightLowPoint){
       double diagonal = leftUpPoint.distance(rightLowPoint);
        return diagonal;
    }
}

