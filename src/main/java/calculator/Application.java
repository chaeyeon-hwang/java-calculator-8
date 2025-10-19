package calculator;

public class Application {
    public static void main(String[] args) {
        try {
            String input = InputView.inputExpression();
            Validator.validate(input);
            Expression expression = new Expression(input);
            Operands operands = new Operands(expression.getTokens());
            int result = operands.sum();
            OutputView.printResult(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
