package lesson10.task2;

public class Audi extends Car{
    public Audi(String brand, String model, String body, int year, Integer maxNumberToGarage) {
        super(brand, model, body, year, maxNumberToGarage);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getBody() {
        return super.getBody();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public Integer getMaxNumberToGarage() {
        return super.getMaxNumberToGarage();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

