package lesson10.task2;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private String body;
    private int year;
    private Integer maxNumberToGarage;

    public Car(String brand, String model, String body, int year, Integer maxNumberToGarage) {
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.year = year;
        this.maxNumberToGarage = maxNumberToGarage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBody() {
        return body;
    }

    public int getYear() {
        return year;
    }

    public Integer getMaxNumberToGarage() {
        return maxNumberToGarage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() &&
                getBrand().equals(car.getBrand()) &&
                getModel().equals(car.getModel()) &&
                getBody().equals(car.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getBody(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", year=" + year +
                '}';
    }
}
