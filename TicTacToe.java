import java.util.Random;

public class TicTacToe {

    // Game State Variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // Generates either 0 or 1

        if (tossResult == 0) {
            // Player 1 (Human) starts
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Player 2 (Computer) starts
            isHumanTurn = false;
            computerSymbol = 'X'; // Computer gets X if it goes first
            humanSymbol = 'O';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss! You will play first.");
        } else {
            System.out.println("The Computer won the toss! The computer will play first.");
        }
        
        System.out.println("Your symbol: " + humanSymbol);
        System.out.println("Computer's symbol: " + computerSymbol);
    }
}