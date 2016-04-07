package isel.poo.expressions;

public class AddN extends NaryOperator {

    public AddN(Expression e1, Expression e2, Expression ... remaining) {
        super(e1, e2, remaining);
    }

    public double eval() {
        double value = 0;
        /*
        for (int i=0; i<expressions.length; ++i) {
            isel.poo.expressions.Expression e = expressions[i];
            value += e.eval();
        }
        */
        for (Expression e : expressions) {
            value += e.eval();
        }
        return value;
    }

    public char operator() {
        return '+';
    }
}
