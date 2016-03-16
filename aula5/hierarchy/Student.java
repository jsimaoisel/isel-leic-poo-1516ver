package hierarchy;

/**
 * Created by jsimao on 15-03-2016.
 */
public class Student extends Person {
    private int number;

    public Student(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
