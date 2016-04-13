package isel.poo.expressions;

/**
 * Created by jsimao on 05-04-2016.
 */

class PairNameValue {
    public String name;
    public double value;
}

public class VariablesArray {

    // tabela de nomes de variaveis e valores
    PairNameValue[] variables;

    public VariablesArray() {
        variables = new PairNameValue[20];
    }

    public void setVar(String name, double value) {
        int i=0;
        for (; i<variables.length; ++i) {
            if (variables[i] == null) {
                // observou-se todas as variaveis e nenhuma tem
                // o nome 'name'
                variables[i] = new PairNameValue();
                variables[i].name = name;
                variables[i].value = value;
                return;
            }
            if (variables[i].name.equals(name)) {
                variables[i].value = value;
                return;
            }
        }
    }

    public double getVar(String name) {
        for (PairNameValue pair : variables) {
            if (pair.name.equals(name)) {
                return pair.value;
            }
        }
        return Double.NaN;
    }


}
