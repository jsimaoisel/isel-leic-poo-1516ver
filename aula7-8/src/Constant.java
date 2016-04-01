
public class Constant implements Expression {
    private double value;

    public Constant(double d) {
        value = d;
    }

    public double eval() {
        return value;
    }

    public String stringify() {
        return Double.toString(value);//""+value;

    }
}
