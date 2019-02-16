package lesson9.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Антон", "Агофонов", 20.8, 10.7),
                new Student("Михаил", "Петров ", 20.3, 3.8),
                new Student("Евгений", "Иванов", 21.4, 14.8),
                new Student("Иван", "Сидоров  ", 21.1, 9.9),
                new Student("Иван", "Пакетный ", 21.1, 12.1)
        );

        printIteratorRating(students);
        printFor(students);
        printIteratorMaxRatingValue(students);
    }

    private static class CustomIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    public static void printFor(List<Student> students) {
        Student result = students.get(0);
        for (Student currentActor : students) {
            if (currentActor.getRating() > result.getRating())
                result = currentActor;
        }
        System.out.println(result);
    }

    public static void printIteratorMaxRatingValue(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        double currentValue = students.get(0).getRating();
        while (iterator.hasNext()) {
            double tempValue = iterator.next().getRating();
            if (tempValue > currentValue) {
                currentValue = tempValue;
            }
        }
        System.out.println(currentValue);
    }

    public static void printIteratorRating(List<Student> students) {
        Iterator<Student> iterator2 = students.iterator();
        Student result1 = students.get(0);
        while (iterator2.hasNext()) {
            Student result2 = iterator2.next();
            if (result1.getRating() < result2.getRating()) {
                result1 = result2;
            }
        }
        System.out.println(result1);
    }
}

