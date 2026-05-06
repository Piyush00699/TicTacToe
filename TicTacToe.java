/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    // Game State Flags
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {
        
        // While Loop: Continues as long as the game is not over
        while (!gameOver) {
            
            if (isHumanTurn) {
                System.out.println("--- Human Player's Turn ---");
                // (Methods for human move will be called here)
            } else {
                System.out.println("--- Computer Player's Turn ---");
                // (Methods for computer move will be called here)
            }

            // Check for Win or Draw logic would go here
            // Example: gameOver = checkWin() || checkDraw();
            
            // Turn Switching: Flips true to false, or false to true
            isHumanTurn = !isHumanTurn;
            
            // Temporary break to prevent an infinite loop during this test step
            System.out.println("Turn switched. Ending loop for demonstration.");
            gameOver = true; 
        }
    }
}