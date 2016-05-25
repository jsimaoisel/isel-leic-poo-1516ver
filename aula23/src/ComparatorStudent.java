import java.util.Comparator;

/**
 * Created by jsimao on 24-05-2016.
 */
public class ComparatorStudent implements
        Comparator<Student>
{

    public int compare(Student o1, Student o2) {
        return o2.getNumber() - o1.getNumber();
    }
}
