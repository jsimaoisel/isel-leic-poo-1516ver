
public abstract class NaryOperator implements Expression {

    protected final Expression[] expressions;

    public NaryOperator(Expression e1, Expression e2, Expression ... remaining) {
        expressions = new Expression[2+remaining.length];
        expressions[0]=e1;
        expressions[1]=e2;
        for (int idx = 0; idx < remaining.length; ++idx) {
            expressions[idx+2] = remaining[idx];
        }
    }

    public abstract char operator();

    public final String stringify() {
        String str = "(";
        for (int i=0; i<expressions.length-1; ++i) {
            str += expressions[i].stringify();
            str += " " + this.operator() + " ";
        }
        str += expressions[expressions.length-1].stringify();
        return str + ")";
    }
}
