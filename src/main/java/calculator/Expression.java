package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    private static final String DEFAULT_DELIMITERS = ",|:";
    private final String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public List<String> getTokens() {
        if (expression == null || expression.isEmpty()) {
            return List.of("0");
        }


        Matcher matcher = Pattern.compile("//(.)\\\\n(.*)").matcher(expression);
        if (matcher.matches()) {
            String customDelimiter = matcher.group(1);
            String numbers = matcher.group(2);
            return split(numbers, customDelimiter);
        }

        return split(expression, DEFAULT_DELIMITERS);
    }

    private List<String> split(String text, String delimiter) {
        String[] tokens = text.split(delimiter);
        List<String> result = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                result.add(token);
            }
        }
        return result;
    }
}
