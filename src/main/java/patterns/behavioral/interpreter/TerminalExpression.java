package patterns.behavioral.interpreter;


public class TerminalExpression implements Expression {
    public int value;

    public TerminalExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
