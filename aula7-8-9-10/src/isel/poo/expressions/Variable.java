package isel.poo.expressions;

/**
 * Created by jsimao on 05-04-2016.
 */
public class Variable implements Expression {
    public static VariablesList allVariables;

    private String name;

    public Variable(String a) {
        name = a;
    }

    public double eval() {
        return allVariables.getVar(name);
    }

    public String stringify() {
        return name;
    }
}
