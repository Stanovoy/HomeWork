package lesson9.task2;

public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private double age;
    private double rating;

    public Student(String firstName, String lastName, double age, double rating){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(rating, o.rating);
    }
}

