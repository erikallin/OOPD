public class TicTacToe {

  public static char[][] board = new char[3][3];

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
    return (!(board == null) ||
              board[0][0] == board[1][0] && board[1][0] == board[2][0] ||
              board[1][0] == board[1][1] && board[1][1] == board[1][2] ||
              board[2][0] == board[2][1] && board[2][1] == board[2][2] ||
              
              board[0][0] == board[0][1] && board[0][1] == board[0][2] ||
              board[0][1] == board[1][1] && board[1][1] == board[2][1] ||
              board[0][2] == board[1][2] && board[1][2] == board[2][2] ||
              
              board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
              board[2][0] == board[1][1] && board[1][1] == board[0][2]);            
              
  }
  
  public static void main(String[] _) {
  
  System.out.println("" + gameOver());
  
  }
}
