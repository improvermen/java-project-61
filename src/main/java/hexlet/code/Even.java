package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void gamer(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        Random random = new Random();

        while (correctAnswers < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = (number%2 == 0) ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            }else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'");
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
