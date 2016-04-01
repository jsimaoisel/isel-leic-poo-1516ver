
public class Main {

    public static void main(String[] args) {
        Expression c2 = new Constant(2);
        Expression c3 = new Constant(3);
        Expression a = new AddN(c2, c3);
        Expression m = new MultN(a, new Constant(10));
        Expression s = new SubN(m, a);
        Expression add4 = new AddN(c2,c3,a,m);
        Expression mult6 = new MultN(c2,c3,c2,c3,c2,c3);

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
        System.out.println(
                add4.stringify() + " = " + add4.eval()
        );
        System.out.println(
                mult6.stringify() + " = " + mult6.eval()
        );
    }
}
