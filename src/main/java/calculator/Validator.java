package calculator;

public class Validator {
    public static void validate(String input) {
        if (input == null || input.trim().isEmpty()) {
            return;
        }

        if (input.contains("-")) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }

        if (!input.matches("^(//.*\\\\n)?[0-9,:;!]*$")) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }
    }
}
