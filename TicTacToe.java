/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe {

    // 2D Array representing a full board without a winner
    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'O', 'O'},
        {'O', 'X', 'X'}
    };

    /**
     * Entry point of the program. Tests draw detection logic.
     */
    public static void main(String[] args) {
        System.out.println(isDraw()); // Should print true for the mock board
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {
        // Loop Traversal to inspect every cell
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // If an empty cell is found, the game can continue
                if (board[r][c] == '-') {
                    return false; 
                }
            }
        }
        // If the loops complete without finding an empty cell, it's a draw
        return true; 
    }
}