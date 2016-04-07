
class MyDay {
    private int dayOfWeek;
    private MyDay(int day) {
        dayOfWeek = day;
    }
    public static final MyDay SUNDAY
            = new MyDay(0);
    public static final MyDay MONDAY
            = new MyDay(1);
    public static final MyDay TUESDAY
            = new MyDay(2);
    public static final MyDay WEDNESDAY
            = new MyDay(3);
    //...
}

public class EnumTest {
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        Day[] allValues = Day.values();
        for (int i=0; i<allValues.length; ++i)
        {
            System.out.println(allValues[i].name());
            System.out.println(allValues[i].ordinal());
        }
        MyDay m = MyDay.MONDAY;

        Planet p = Planet.EARTH;
        System.out.println(p.ordinal());
        System.out.println(p.name());

    }
}
