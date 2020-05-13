package patterns.behavioral.interpreter;


public class AddExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public AddExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
