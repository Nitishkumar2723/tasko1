import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate secret number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess a number between 1 and 100.");

        // Loop until player guesses correctly
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Your guess is higher than the number.");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is lower than the number.");
            } else {
                System.out.println("Congratulations! You guessed the number " 
                                   + secretNumber + " correctly in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}








