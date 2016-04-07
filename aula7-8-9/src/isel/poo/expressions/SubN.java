package isel.poo.expressions;

public class SubN extends NaryOperator {

    public SubN(Expression e1, Expression e2, Expression ... remaining) {
        super(e1, e2, remaining);
    }

    public char operator() {
        return '-';
    }

    public double eval() {
        double value = expressions[0].eval();

        for (int i=1; i<expressions.length; ++i) {
            Expression e = expressions[i];
            value -= e.eval();
        }

        return value;
    }
}
