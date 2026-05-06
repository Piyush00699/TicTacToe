import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    // Pre-initialized board for testing
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        boolean validMoveFound = false;

        // Loop until the computer finds an empty slot
        while (!validMoveFound) {
            // Generate a random slot between 1 and 9
            // nextInt(9) generates 0-8, so we add 1
            int randomSlot = random.nextInt(9) + 1; 

            // Convert slot to array indices (Reusing logic from UC4)
            int row = getRowFromSlot(randomSlot);
            int col = getColFromSlot(randomSlot);

            // Check if the move is valid (Reusing logic from UC5)
            if (isValidMove(row, col)) {
                // Place the move (Reusing logic from UC6)
                placeMove(row, col, computerSymbol);
                System.out.println("Computer placed '" + computerSymbol + "' at slot " + randomSlot);
                validMoveFound = true; // Exit the loop
            }
        }
    }

    // --- Placeholder methods mimicking UC4, UC5, UC6 for the code to compile ---
    static int getRowFromSlot(int slot) { return (slot - 1) / 3; }
    static int getColFromSlot(int slot) { return (slot - 1) % 3; }
    static boolean isValidMove(int row, int col) { return board[row][col] == '-'; }
    static void placeMove(int row, int col, char symbol) { board[row][col] = symbol; }
}