package poo.list;

/**
 * Created by jsimao on 19-04-2016.
 */
public class NestedExample {

    static public class X {
        public int a;
        public X(int a) {
            this.a = a;
        }
    }

    public static void m(final int d) {
        final X b=new X(1);

        class LocalClass {
            private int a;
            public void w() {
                a++;
                b.a++;
                System.out.println(b.a);
                System.out.println(c);
            }
        }

        LocalClass obj = new LocalClass();
        b.a=10;

        obj.w();

    }

    public static void main(String[] args) {
        m();
    }
}
