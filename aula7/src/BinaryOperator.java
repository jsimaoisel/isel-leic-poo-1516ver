
public abstract class BinaryOperator extends Expression {

    protected final Expression l, r;
    private final char op;

    public BinaryOperator(Expression l, Expression r, char op) {
        this.l = l;
        this.r = r;
        this.op = op;
    }

    public String stringify() {
        String lstr = "(" + l.stringify();
        String rstr = r.stringify() + ")";
        return lstr + " " + op + " " + rstr;
    }
}
