import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int totalAttempts = 0;
        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit; System.out.println("Guess the number between " + lowerLimit + " and " + upperLimit);int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "!");
                    guessedCorrectly = true;
                    totalAttempts += attempts + 1;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attempts++;
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
            }
            roundsPlayed++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Total attempts: " + totalAttempts);
        scanner.close();
    }
}
