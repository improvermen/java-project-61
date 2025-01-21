package hexlet.code.games;
import java.util.Random;

public class Prime {
    Random random = new Random();

    public int generateQuestionPrime() {
        return random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
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
        return isPrime(number) ? "yes" : "no"; // Возвращаем "yes" или "no" в зависимости от простоты числа
    }
}
