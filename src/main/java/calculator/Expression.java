package calculator;

public class Expression {

    public static String[] split(String input) {
        if (input == null || input.isEmpty()) {
            return new String[]{"0"};
        }

        if (input.startsWith("//")) {
            String delimiter = String.valueOf(input.charAt(2));
            String target = input.substring(5);
            return target.split(delimiter);
        }

        return input.split("[,:]");
    }
}
