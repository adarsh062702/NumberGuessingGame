import java.util.Random;
import java.util.Scanner;

public class Adarsh {

    public static void main(String[] args){

        //number guessing game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do{
            int guess = 0;
            int attempt = 0;
            int maxAttempts = 7;
            int randomNumber = random.nextInt(1 ,101);
            boolean guessCorrectly = false;

            System.out.println("Number Guessing Game!");
            System.out.println("You have 7 attempts to Guess the number between 1-100!");

            while (attempt < maxAttempts) {
                System.out.print("Attempt " + (attempt + 1) + " Enter your guess: ");
                guess = scanner.nextInt();
                attempt++;

                if (guess > randomNumber) {
                    System.out.println("TOO HIGH TRY AGAIN");
                } else if (guess < randomNumber) {
                    System.out.println("TOO LOW TRY AGAIN");
                } else {
                    System.out.println("Correct the number was " + randomNumber + " 🥳");
                    System.out.println("It took you " + attempt + " Attempts ");
                }
            }

            if (!guessCorrectly){
                System.out.println("\nYou've used all " + maxAttempts + " attempts!");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next().toLowerCase();

        }while (playAgain.equals("yes"));

        System.out.println("👋 Thanks for playing!");

        scanner.close();
    }
}
