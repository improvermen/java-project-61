package hexlet.code.games;

import java.util.Random;

public class Gcd {
    private Random random = new Random();

    public int[] generateQuestion() {
        int num1 = random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
        int num2 = random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
        return new int[]{num1, num2};
    }

    public int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
