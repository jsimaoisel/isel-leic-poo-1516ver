package hierarchy;

/**
 * Created by jsimao on 17-03-2016.
 */
public class Faculty extends Employee {
    public String course;

    public Faculty(String name, String department, String course) {
        super(name, department);
        this.course = course;
    }

    public String toString() {
        return "Faculty {" +
                "\t" + getName() +
                "\t" + getDepartment() +
                "\t" + course +
                "}";
    }
}
