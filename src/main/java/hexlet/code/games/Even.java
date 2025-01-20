package hexlet.code.games;

import java.util.Random;

public class Even {
    private Random random = new Random();

    public int generateQuestion() {
        return random.nextInt(100);
    }

    public String getCorrectAnswer(int currentNumber) {
        return (currentNumber % 2 == 0) ? "yes" : "no";
    }
}
