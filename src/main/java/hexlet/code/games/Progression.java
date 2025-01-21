package hexlet.code.games;
import java.util.Random;

public class Progression {
     Random random = new Random();
     int MIN_LENGTH = 5;
     int MAX_LENGTH = 10;

    public String generateQuestion() {
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH; // Длина от 5 до 10
        int start = random.nextInt(10); // Начальное значение прогрессии
        int step = random.nextInt(5) + 1; // Шаг прогрессии от 1 до 5

        int missingIndex = random.nextInt(length); // Случайная позиция для пропуска
        StringBuilder question = new StringBuilder();
        int correctAnswer = 0;

        for (int i = 0; i < length; i++) {
            int currentValue = start + i * step;
            if (i == missingIndex) {
                question.append(".. "); // Пропущенное значение
                correctAnswer = currentValue; // Запоминаем правильный ответ
            } else {
                question.append(currentValue).append(" ");
            }
        }

        return question.toString() + "|" + correctAnswer; // Возвращаем строку с вопросом и правильным ответом
    }
}
