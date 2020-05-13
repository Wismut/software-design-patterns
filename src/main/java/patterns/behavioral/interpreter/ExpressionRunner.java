package patterns.behavioral.interpreter;


public class ExpressionRunner {
    public static void main(String[] args) {
        System.out.println(new AddExpression(new TerminalExpression(1),
                new TerminalExpression(2)).interpret());
    }
}
