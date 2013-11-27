import java.util.Scanner;

public class TicTacToe {

  public static char[][] board = new char[3][3];

  /**
   * Tager en String og giver den samme String igen, dog i fed skrift
   * @param text den tekst man vil have i fed skrift
   * @return en String med ansi-kode til fed skrift
   */
  private static String makeBold(String text) {
    return "\u001B[1m" + text + "\u001B[0m";
  }

  /**
   * Giver et nyt bræt ved at overskrive det nuværende bræt
   */
  private static void newBoard() {
    board = new char[3][3];
  }

  /**
   * Printer brættets nuværende status
   */
   private static void printBoard() {
    for(int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == 2) {
          if (isOccupied(i,j))
           System.out.print("|" + board[i][j] + "|");
         else
           System.out.print("|" + " " + "|");
        }
        else
          if (isOccupied(i,j))
            System.out.print("|" + board[i][j]);
          else
            System.out.print("|" + " ");
      }
      System.out.println();
    }
  }


  /**
   * Ser om den ønskede plads er optaget. Her tjekkes der om der ikke er nogen
   * værdi i den ønskede celle.
   *
   * @param row hvilken række man vil have
   * @param col hvilken søjle man vil have
   *
   * @return om feltet indeholder noget
   */
  private static boolean isOccupied(int row, int col) {
    return (board[row][col] == 'X' || board[row][col] == 'O');
  }

  /**
   * Ser brættet er fyldt og om en af spillerne har tre på stribe
   * @return om spillet er slut
   */
  private static boolean gameOver() {
   /* for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        if (board[i][j] != 'X' || board[i][j] != 'O')
        return false; */

    int bolleCount = 0;
    int krydsCount = 0;
    int pladsCount = 9;

    // TODO få den til at tælle rigtigt!
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        if (board[row][col] == 'X')
          krydsCount++;
        else
          if (board[row][col] == 'O')
            bolleCount++;
          else
            pladsCount--;
      }
    }
    return (krydsCount == 3 || bolleCount == 3 || pladsCount == 0);
  }

/*
              board[0][0] == board[1][0] && board[1][0] == board[2][0] ||
              board[1][0] == board[1][1] && board[1][1] == board[1][2] ||
              board[2][0] == board[2][1] && board[2][1] == board[2][2] ||

              board[0][0] == board[0][1] && board[0][1] == board[0][2] ||
              board[0][1] == board[1][1] && board[1][1] == board[2][1] ||
              board[0][2] == board[1][2] && board[1][2] == board[2][2]); */


  /**
   * Ser om tegnet er X eller O
   * @return om tegnet er et legalt input
   */
  private static boolean isLegalChar(char piece) {
    return piece == 'X' || piece == 'O';
  }

  private static boolean isLegalCoord(int row, int col) {
    return ((row >= 0 && row < 3) && (col >= 0 && col < 3));
  }


  /**
   * Indsætter et givent tegn på den ønskede plads og viser brættets nuværende
   * status
   * @param row hvilken række man vil placere tegnet
   * @param col hvilken søjle man vil placere tegnet
   * @param piece tegnet som skal placeres
   */
  private static void placeMove(int row, int col, char piece) {
    if (isOccupied(row, col))
      System.out.println("\u001B[31mUgyldigt træk! Pladsen er taget.\u001B[0m");
    else {
      board[row][col] = piece;
      System.out.println(piece +
          " er blevet lagt på (" + row + "," + col + ")");
    }
    printBoard();
  }


  /**
   * Starter spillet
   */
  private static void play() {
    newBoard();
    System.out.println(makeBold("Let the game begin!\n"));

       int x, y; // koordinater
       char tegn = 0;
       String[] input = new String[3]; // Et array som holder x, y og tegn

       do {
         System.out.print("Indtast et koordinat og brik\n>");
         input = (new Scanner(System.in).nextLine()).split(" ");

         x = Integer.parseInt(input[0]);
         y = Integer.parseInt(input[1]);
         tegn = input[2].toUpperCase().charAt(0);

         if (isLegalChar(tegn) && isLegalCoord(x, y))
           placeMove(x, y, tegn);
         else {
           System.out.println("Tegn og koordinat skal være legale!");
           //continue;
         }
       }
       while (!gameOver());

    System.out.print("\nVil du starte et nyt spil? (y/n) ");
    if (new Scanner(System.in).next().equals("y"))
      play();
  }

  public static void main(String[] _) {

    play();

  }
}
