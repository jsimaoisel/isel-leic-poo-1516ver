/**
 * Created by jsimao on 24-05-2016.
 */
public class Student implements Comparable<Student>{
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "Nr: " + number + "; Name: " + name;
    }

    public int compareTo(Student s) {
        return this.number - s.number;
    }
}
