package hexlet.code.games;

import java.util.Random;

public class Calc {
    private Random random = new Random();
    private int num1;
    private int num2;
    private String operation;

    public String generateQuestion() {
        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        operation = new String[]{"+", "-", "*"}[random.nextInt(3)];

        return String.format("%d %s %d", num1, operation, num2);
    }

    public String getCorrectAnswer() {
        switch (operation) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
