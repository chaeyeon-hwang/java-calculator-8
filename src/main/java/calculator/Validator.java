package calculator;

public class Validator {
    public static void validate(String input) {
        if (input == null) {
            throw new IllegalArgumentException("입력값이 null입니다.");
        }
        if (input.contains("-")) {
            throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
        }
    }
}
