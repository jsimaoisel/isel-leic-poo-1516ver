
public class Mult extends BinaryOperator {

    public Mult(Expression l, Expression r) {
        super(l, r, '*');
    }

    public double eval() {
        return l.eval() * r.eval();
    }
}
