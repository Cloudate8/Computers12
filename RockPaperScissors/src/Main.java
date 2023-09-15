import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String rpsChoice(int choice) {
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            case 2 -> "Scissors";
            default -> "Invalid choice";
        };
    }

    public static void main(String[] args) {
        final String rpsMenu = """
                Enter a number:
                0) Rock
                1) Paper
                2) Scissors
                3) Exit""";
        final String invalidInput = "Invalid input. Please enter a number that is a minimum of 0, and a maximum of 3.";
        final String exitMessage = "Thanks for playing, goodbye!";

        //Templates should not be printed with System.out.println(), but rather with System.out.printf()
        final String loseMessageTemplate = "You lose this game! You chose %s and the computer chose %s.\n";
        final String tieMessageTemplate = "You and the computer tied with %s!\n";
        final String winMessageTemplate = "You win this game! You chose %s and the computer chose %s.\n";
        final String scoreTemplate = "Scores: You: %d, Computer: %d\n";

        int playerScore = 0;
        int computerScore = 0;

        final String playAgainMessage = "Wanna play another round?";

        //Keep looping the game till they quit.
        //Use while true so that we don't pollute the scope of the main method, and because there is no real benefit to using playerNumber as the condition.
        while (true) {
            //Present menu to user for them to make a choice
            System.out.println(rpsMenu);
            Scanner scanner = new Scanner(System.in);

            //Get user input. Store the player choice as a number.
            final int playerNumber;
            try {
                playerNumber = scanner.nextInt(); //Can cause an error if the user enters a non-integer. Catch that, and print invalid input message.
            } catch (InputMismatchException ex) {
                System.out.println(invalidInput);
                //Skip to the next iteration of the loop, we can't do much with an invalid input
                continue;
            }

            //Range check - anything outside the range 0-3 is invalid
            if (playerNumber > 3 || playerNumber < 0) {
                System.out.println(invalidInput);
                //Skip to the next iteration of the loop, we can't do much with an invalid input
                continue;
            }

            if (playerNumber == 3) { //If they chose to quit, exit the loop
                System.out.println(exitMessage);
                //Directly end the program
                return;
            }

            //Computer choice time! Do this after the player input is validated, so that we don't need to create an unnecessary computer choice if the player input is invalid
            final int computerNum = new Random().nextInt(3);

            //Use a method to get the string representation of the choice.
            final String playerChoice = rpsChoice(playerNumber);
            final String computerChoice = rpsChoice(computerNum);

            //Get result of the game, and change the score accordingly

            //Tie
            if (computerChoice.equals(playerChoice)) System.out.printf(tieMessageTemplate, playerChoice);

                //Player lose conditions
            else if (playerChoice.equals("Rock") && computerChoice.equals("Paper") ||
                    playerChoice.equals("Paper") && computerChoice.equals("Scissors") ||
                    playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
                ++computerScore;
                System.out.printf(loseMessageTemplate, playerChoice, computerChoice);
            }
            //Play won if they didn't lose or tie (shrug)
            else {
                ++playerScore;
                System.out.printf(winMessageTemplate, playerChoice, computerChoice);
            }

            //Print the score
            System.out.printf(scoreTemplate, playerScore, computerScore);

            //This just makes the loop look nice - the player can't respond to this
            System.out.println(playAgainMessage);
        }
    }
}