package hexlet.code.games;
import java.util.Random;

public class Progression {
     Random random = new Random();
     int MIN_LENGTH = 5;
     int MAX_LENGTH = 10;

    public String generateQuestion() {
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int start = random.nextInt(10);
        int step = random.nextInt(5) + 1;


        int missingIndex = random.nextInt(length);

        StringBuilder question = new StringBuilder();
        int correctAnswer = 0;

        for (int i = 0; i < length; i++) {
            int currentValue = start + i * step;
            if (i == missingIndex) {
                question.append(".. ");

                correctAnswer = currentValue;

            } else {
                question.append(currentValue).append(" ");
            }
        }

        return question.toString() + "|" + correctAnswer;

    }
}
