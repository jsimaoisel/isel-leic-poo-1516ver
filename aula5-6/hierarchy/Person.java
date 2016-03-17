package hierarchy;

/**
 * Created by jsimao on 15-03-2016.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person {" +
               "\t" + name +
               "}";
    }

}
