package lesson9.task2;

import java.util.Comparator;

public class StudentRatingComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
