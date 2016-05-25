import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by jsimao on 24-05-2016.
 */
public class ClassTeam {
    private SortedSet<Student> students;

    public ClassTeam() {
        students = new TreeSet(
                new ComparatorStudent()
        );
    }

    public void add(Student s) {
        students.add(s);
    }

    /*public boolean remove(Student e) {

    }*/

    public int size() {
        return students.size();
    }

    public void showAll() {
        for (Student s : students) {
            System.out.println(s);
        }

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


    public static void main(String[] args) {
        ClassTeam classTeam = new ClassTeam();

        classTeam.add(new Student(10,"a"));
        classTeam.add(new Student(4,"b"));
        classTeam.add(new Student(40,"c"));
        classTeam.add(new Student(14,"d"));

        classTeam.showAll();
    }

}
