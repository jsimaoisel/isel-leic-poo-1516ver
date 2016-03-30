
public class Add extends BinaryOperator {

    public Add(Expression l, Expression r) {
        super(l, r, '+');
    }

    public double eval() {
        return l.eval() + r.eval();
    }
}
