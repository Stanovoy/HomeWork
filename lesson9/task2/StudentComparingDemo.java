package lesson9.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparingDemo {

    public static void main(String[] args) {

        Student anton = new Student("Антон", "Агофонов", 20.8, 8.7);
        Student misha = new Student("Михаил", "Петров ", 20.3, 7.6);
        Student jeka = new Student("Евгений", "Иванов", 21.4, 9.1);
        Student ivan = new Student("Иван", "Сидоров  ", 21.1, 7.9);
        Student ivan1 = new Student("Иван", "Пакетный ", 21.1, 7.9);

        List<Student> students = new ArrayList<>();
        students.add(anton);
        students.add(misha);
        students.add(jeka);
        students.add(ivan);
        students.add(ivan1);

        System.out.println("*******\nСортировка *COMPARABLE* по успеваемости\n*******");
        Collections.sort(students);
        print(students);

        System.out.println("*******\nСортировка *COMPARATOR* по полному имени\n*******");
        students.sort(
                new StudentFirstNameComparator().thenComparing(new StudentLastNameComparator())
        );
        students.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName));
        print(students);

        System.out.println("*******\nСортировка *COMPARATOR* по возрасту\n*******");
        students.sort(
                new StudentAgeComparator().thenComparing(new StudentAgeComparator())
        );
        students.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getAge));
        print(students);

        System.out.println("*******\nСортировка *COMPARATOR* по успеваемости\n*******");
        students.sort(
                new StudentAgeComparator().thenComparing(new StudentAgeComparator())
        );
        students.sort(Comparator.comparing(Student::getRating).thenComparing(Student::getRating));
        print(students);
    }


    private static void print(List<Student> students) {
        for (Student p : students) {
            System.out.println(p.getFirstName() +
                    " " + p.getLastName() +
                    " \\ возраст " + p.getAge() +
                    " \\ средний бал " + p.getRating());
        }
    }
}


