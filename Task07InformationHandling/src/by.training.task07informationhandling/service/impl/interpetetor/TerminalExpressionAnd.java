public class TerminalExpressionAnd extends AbstractMathExpression {

    @Override
    public void interpret(Context context) {
        context.push( context.pop() & context.pop());
    }
}
