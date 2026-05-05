/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    // Pre-initialized board for testing validation logic
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        // Testing a valid move
        System.out.println(isValidMove(1, 1)); 
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Step 1: Boundary Checking
        // If the row or column is less than 0 or greater than 2, it's out of bounds.
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        
        // Step 2: Empty Cell Checking
        // If the cell does not contain the empty placeholder '-', it is already taken.
        if (board[row][col] != '-') {
            return false;
        }
        
        // If it passes both checks, the move is valid.
        return true;
    }
}