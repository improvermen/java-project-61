package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public Scanner scanner = new Scanner(System.in);
    public Random random = new Random();

    public void startEvenGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int currentNumber = random.nextInt(100);
            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = (currentNumber % 2 == 0) ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.printf("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.printf("Let's try again, " + name);
                return;
            }
        }
        System.out.printf("Congratulations, " + name);
    }

    public void startCalcGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            String operation = new String[]{"+", "-", "*"}[random.nextInt(3)];

            String question = String.format("%d %s %d", num1, operation, num2);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer;
            switch (operation) {
                case "+":
                    correctAnswer = String.valueOf(num1 + num2);
                    break;
                case "-":
                    correctAnswer = String.valueOf(num1 - num2);
                    break;
                case "*":
                    correctAnswer = String.valueOf(num1 * num2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation: " + operation);
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", name);
    }
}
