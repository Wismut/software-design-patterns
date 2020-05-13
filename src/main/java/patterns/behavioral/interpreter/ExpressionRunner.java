package patterns.behavioral.interpreter;


public class ExpressionRunner {
    public static void main(String[] args) {
        System.out.println("1 + 2 = " + new AddExpression(new TerminalExpression(1),
                new TerminalExpression(2)).interpret());
        System.out.println("3 * 5 = " + new ProductExpression(new TerminalExpression(3),
                new TerminalExpression(5)).interpret());
    }
}
