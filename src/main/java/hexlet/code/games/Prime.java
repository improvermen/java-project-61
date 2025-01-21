package hexlet.code.games;
import java.util.Random;

public class Prime {
    Random random = new Random();

    public int generateQuestionPrime() {
        return random.nextInt(100) + 1;

    }

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getCorrectAnswer(int number) {
        return isPrime(number) ? "yes" : "no";

    }
}
