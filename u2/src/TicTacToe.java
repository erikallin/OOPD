import java.util.Scanner;

public class TicTacToe {

  public static char[][] board = new char[3][3];

  private static String makeBold(String text) {
    return "\u001B[1m" + text + "\u001B[0m";

  }

  private static void newBoard() {
    board = new char[3][3];
  }

   private static void printBoard() {
    for(int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == 2)
          System.out.print("|" + board[i][j] + "|");
        else
          System.out.print("|" + board[i][j]);
      }

      System.out.println();
    }
  }


  private static boolean isOccupied(int row, int col) {
    return (!((Character) board[row][col]).equals(0));
  }

  private static boolean gameOver() {
    return ((board == null) ||
              board[0][0] == board[1][0] && board[1][0] == board[2][0] ||
              board[1][0] == board[1][1] && board[1][1] == board[1][2] ||
              board[2][0] == board[2][1] && board[2][1] == board[2][2] ||

              board[0][0] == board[0][1] && board[0][1] == board[0][2] ||
              board[0][1] == board[1][1] && board[1][1] == board[2][1] ||
              board[0][2] == board[1][2] && board[1][2] == board[2][2] ||

              board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
              board[2][0] == board[1][1] && board[1][1] == board[0][2]);

  }


  private static void placeMove(int row, int col, char piece) {
    if (!isOccupied(row, col))
      System.out.println("Ugyldigt træk! Pladsen er taget.");
    else {
      board[row][col] = piece;
      System.out.println(piece +
          " er blevet lagt på (" + row + "," + col + ")");
    }
    printBoard();
  }



  private static void play() {
    System.out.println(makeBold("Let the game begin!"));
  }



  public static void main(String[] _) {

    placeMove(0,0,'X');
    System.out.println("" + gameOver());

/*    do {
      String move = (new Scanner(System.in)).next();

    }
    while (!gameOver());
*/
    play();


  }
}
