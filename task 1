import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Additional details
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

            System.out.println("Guess the number between " + lowerLimit + " and " + upperLimit);

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "!");
                    guessedCorrectly = true;
                    totalAttempts += attempts + 1;  // Calculate score
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            // Check if the user has run out of attempts
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
            }

            // Additional details
            roundsPlayed++;

            // Step 6: Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        // Step 7: Display the user's score
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Total attempts: " + totalAttempts);

        // Close the scanner
        scanner.close();
    }
}
