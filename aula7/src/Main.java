
public class Main {

    public static void main(String[] args) {
        Expression c2 = new Constant(2);
        Expression c3 = new Constant(3);
        Expression a = new Add(c2, c3);
        Expression m = new Mult(a, new Constant(10));
        Expression s = new Sub(m, a);

        System.out.println(
                a.stringify() + " = " +
                a.eval()
        );
        System.out.println(
                m.stringify() + " = " + m.eval()
        );
        System.out.println(
                s.stringify() + " = " + s.eval()
        );
    }
}
