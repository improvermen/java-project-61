package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public Scanner scanner = new Scanner(System.in);
    public Random random = new Random();

    public void startEvenGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int currentNumber = random.nextInt(100);
            System.out.println("Question: " + currentNumber);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = (currentNumber % 2 == 0) ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.printf("Congratulations, " + name);
    }

    public void startCalcGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
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
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = switch (operation) {
                case "+" -> String.valueOf(num1 + num2);
                case "-" -> String.valueOf(num1 - num2);
                case "*" -> String.valueOf(num1 * num2);
                default -> throw new IllegalArgumentException("Unknown operation: " + operation);
            };

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name);
    }

    public void startGCDGame() {
        Gcd gcdGame = new Gcd();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int[] numbers = gcdGame.generateQuestion();
            int num1 = numbers[0];
            int num2 = numbers[1];
            System.out.println("Question: " + num1 + " " + num2);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine().trim();

            int correctAnswer = gcdGame.getGcd(num1, num2);
            if (Integer.parseInt(answer) == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name);
    }

    public void startProgression() {
        Progression progressionGame = new Progression();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            String[] questionAndAnswer = progressionGame.generateQuestion().split("\\|");
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public void startPrime() {
        Prime primeGame = new Prime();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int question = primeGame.generateQuestionPrime();
            String correctAnswer = primeGame.getCorrectAnswer(question);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

