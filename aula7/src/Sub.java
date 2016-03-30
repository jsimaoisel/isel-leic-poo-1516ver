
public class Sub extends BinaryOperator {

    public Sub(Expression l, Expression r) {
        super(l,r,'-');
    }

    public double eval() {
        return l.eval() - r.eval();
    }
}
