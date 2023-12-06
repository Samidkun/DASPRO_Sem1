import java.util.Scanner;
import java.util.Random;

/**
 * quiz09
 */
public class quiz09modify {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int guess = input.nextInt();
                input.nextLine();

                if (guess < number) {
                    System.out.println("Too small! Try again.");
                } else if (guess > number) {
                    System.out.println("Too large! Try again.");
                } else {
                    success = true;
                }

            } while (!success);

            System.out.println("Congratulations! You guessed the correct number.");

            System.out.print("Do you want to repeat the game (Y/N): ");
            menu = input.next().charAt(0);
            input.nextLine();

        } while (menu == 'Y' || menu == 'y');

        input.close();
    }
}
