package hierarchy;

/**
 * Created by jsimao on 15-03-2016.
 */
public class Employee extends Person {

    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
