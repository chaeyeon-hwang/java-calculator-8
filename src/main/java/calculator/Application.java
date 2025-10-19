package calculator;

public class Application {
    public static void main(String[] args) {
        try {

            String input = InputView.read();

            String[] tokens = Expression.split(input);

            int result = Operands.sum(tokens);

            OutputView.printResult(result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
