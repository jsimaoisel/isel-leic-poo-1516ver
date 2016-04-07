package isel.poo.expressions;

public class Main {

    public static void main(String[] args) {
/*
        isel.poo.expressions.Expression c2 = new isel.poo.expressions.Constant(2);
        isel.poo.expressions.Expression c3 = new isel.poo.expressions.Constant(3);
        isel.poo.expressions.Expression a = new isel.poo.expressions.AddN(c2, c3);
        isel.poo.expressions.Expression m = new isel.poo.expressions.MultN(a, new isel.poo.expressions.Constant(10));
        isel.poo.expressions.Expression s = new isel.poo.expressions.SubN(m, a);
        isel.poo.expressions.Expression add4 = new isel.poo.expressions.AddN(c2,c3,a,m);
        isel.poo.expressions.Expression mult6 = new isel.poo.expressions.MultN(c2,c3,c2,c3,c2,c3);

        System.out.println(
                a.stringify() + " = " +
                a.eval()
        );
        System.out.println(
                m.stringify() + " = " + m.eval()
        );
        System.out.println(
                s.stringify() + " = " + s.eval()
        );
        System.out.println(
                add4.stringify() + " = " + add4.eval()
        );
        System.out.println(
                mult6.stringify() + " = " + mult6.eval()
        );*/

        Expression exp = new AddN(new Variable("a"), new Constant(1));
        System.out.println(exp.stringify());

        Variable.allVariables = new VariablesList();
        Variable.allVariables.setVar("a", 10);
        Variable.allVariables.setVar("ab", 5);
        Variable.allVariables.setVar("x", 2);

        System.out.println(exp.eval()); // avalia para 11

        Variable.allVariables.setVar("a", 1);
        System.out.println(exp.eval()); // avalia para 2

        String a = Variable.allVariables.getFirst();
        System.out.println(a);
        while ((a = Variable.allVariables.getNext()) != null) {
            System.out.println(a);
        }

    }
}
