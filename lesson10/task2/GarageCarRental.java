package lesson10.task2;

import java.util.HashMap;
import java.util.Map;

public class GarageCarRental {
    public static void main(String[] args) {

        Car alfaRomeo = new AlfaRomeo("ALFA ROMEO", "146 Junior", "hatchback", 1985, 3);
        Car audi = new Audi("AUDI", "S8", "sedan", 2018, 4);
        Car bmw = new Bmw("BMW", "X6", "crossover", 2019, 2);
        Car bentley = new Bentley("BENTLEY", "Continental GT", "coupe", 2016, 5);

        HashMap<Car, Integer> map = new HashMap<>();
        map.put(alfaRomeo, alfaRomeo.getMaxNumberToGarage());
        map.put(audi, audi.getMaxNumberToGarage());
        map.put(bmw, bmw.getMaxNumberToGarage());
        map.put(bentley, bentley.getMaxNumberToGarage());

        departure(map, alfaRomeo);
        departure(map, alfaRomeo);
        departure(map, alfaRomeo);
        departure(map, alfaRomeo);
        parcing(map, alfaRomeo);
        parcing(map, alfaRomeo);
        parcing(map, alfaRomeo);
        parcing(map, alfaRomeo);
        parcing(map, alfaRomeo);
        getNumber(map, alfaRomeo);
    }

    public static void departure(Map<Car, Integer> map, Car car) {
        Integer number = map.get(car);
        if (number > 0) {
            number = number - 1;
            map.put(car, number);
            System.out.println("Машина выехала, в наличии " + number + "авто");
        } else if (number < 1) {
            System.out.println("Все машины запрашмваемой модели выехали");
        }
    }

    public static void parcing(Map<Car, Integer> map, Car car) {
        Integer number = map.get(car);
        if (car.getMaxNumberToGarage() > map.get(car)) {
            number = number + 1;
            map.put(car, number);
            System.out.println("Машина въехала, в наличии " +
                    (car.getMaxNumberToGarage() - number) + "свободных мест");
        } else if (number.equals(car.getMaxNumberToGarage())) {
            System.out.println("Это не наше авто, наши все на месте");
        }
    }

    public static void getNumber(Map map, Car car) {
        System.out.println("В наличии " + map.get(car) + " авто");
    }
}


