package hexlet.code;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");

            System.out.println("0 - Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    Cli.greetUser();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
