package calculator;

public class Operands {

    public static int sum(String[] tokens) {
        int total = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token);

            if (num < 0) {
                throw new IllegalArgumentException("잘못된 입력 형식입니다.");
            }

            total += num;
        }

        return total;
    }
}
