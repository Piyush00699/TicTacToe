/**
 * TicTacToe
 * UC9 checks whether a player has won by examining
 * rows, columns, and diagonals.
 */
public class TicTacToe {

    // 2D Array to represent the 3x3 board
    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests the win-check logic.
     */
    public static void main(String[] args) {
        
        // Simulating a winning board for testing purposes
        board[0][0] = 'X';
        board[1][1] = 'X';
        board[2][2] = 'X';
        
        System.out.println(hasWon('X')); // Should print true
    }

    /**
     * Checks all possible winning patterns for the given symbol.
     * Input: Player symbol
     * Output: true if win detected.
     */
    static boolean hasWon(char symbol) {
        
        // Loop-Based Checks for Rows and Columns
        for (int i = 0; i < 3; i++) {
            // Check Row 'i'
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            // Check Column 'i'
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        
        // Logical Conditions for Diagonals
        // Top-Left to Bottom-Right
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        // Top-Right to Bottom-Left
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        
        // If no patterns match, the player has not won yet
        return false;
    }
}