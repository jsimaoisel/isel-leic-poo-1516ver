package hierarchy;

/**
 * Created by jsimao on 15-03-2016.
 */
public class Main {

    public static void show(Person p) {
        if (p instanceof Student) {
            showStudent((Student)p);
        } else if (p instanceof Employee) {
            showEmployee((Employee)p);
        } else {
            showPerson(p);
        }
    }

    public static void showPerson(Person p) {
        System.out.println("Person {");
        System.out.println("\t" + p.getName());
        System.out.println("}");
    }

    public static void showStudent(Student s) {
        System.out.println("Student {");
        System.out.println("\t" + s.getNumber());
        System.out.println("\t" + s.getName());
        System.out.println("}");
    }

    public static void showEmployee(Employee e) {
        System.out.println("Employee {");
        System.out.println("\t" + e.getDepartment());
        System.out.println("\t" + e.getName());
        System.out.println("}");
    }

    public static void main(String[] args) {
        Person p = new Employee("maria", "adeetc");
        Student s = new Student("jose", 12345);

        show(p);
        show(s);
        show(new Person("manuel"));
    }
}


