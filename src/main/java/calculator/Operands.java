package calculator;

import java.util.List;

public class Operands {
    private final List<String> tokens;

    public Operands(List<String> tokens) {
        this.tokens = tokens;
    }

    public int sum() {
        int total = 0;
        for (String token : tokens) {
            int number = toInt(token);
            total += number;
        }
        return total;
    }

    private int toInt(String token) {
        try {
            int number = Integer.parseInt(token);
            if (number < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 숫자 입력입니다: " + token);
        }
    }
}
