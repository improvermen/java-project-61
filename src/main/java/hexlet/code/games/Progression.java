package hexlet.code.games;
import java.util.Random;

public class Progression {
    Random random = new Random();
    int minLength = 5;
    int maxLength = 10;

    public String generateQuestion() {
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
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

        return question + "|" + correctAnswer;

    }
}
