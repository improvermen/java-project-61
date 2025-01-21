package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        boolean running = true;

        while (running) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            int choice = engine.scanner.nextInt();
            engine.scanner.nextLine();

            switch (choice) {
                case 1:
                    Cli.greetUser();
                    break;
                case 2:
                    engine.startEvenGame();
                    break;
                case 3:
                    engine.startCalcGame();
                    break;
                case 4: engine.startGCDGame();
                    break;
                case 5: engine.startProgression();
                    break;
                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        engine.scanner.close();
    }
}

