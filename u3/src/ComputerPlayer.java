import java.util.Random;

public class ComputerPlayer {
  private Game n;
  private int difficulty;

  /**
   * Bestemmer om computeren foretager et smart eller dumt valg.
   * @param difficulty Computerens sværhedsgrad
   * @return hvorvidt computeren foretager et smartMove eller et dumbMove.
   */
  public ComputerPlayer(Game n) {
    this.n = n;
    this.difficulty = new Random().nextInt(2);
  }
  public int makeMove() {
    if (this.difficulty == 1) {
      return smartMove();
    }
    else {
      return dumbMove();
  }
}

  /**
   * Definerer computerens smarte valg af kugler den tager fra heapet.
   * @return antal kugler computeren tager fra heapet
   */
  public int smartMove() {
	  int WONT_GET_THERE = -1;

	  for (int i = 1; i <= n.getHeap(); i++)
		  if (n.getHeap() < (int) Math.pow(2, i) - 1) {
			  System.out.println("Computeren fjerner "
             + (n.getHeap() - ((int) Math.pow(2, i - 1) - 1)));
			  return (n.getHeap() - ((int) Math.pow(2, i - 1) - 1));
          }

   for (int i = 2; i < 6; i++)
		  if (n.getHeap() % ((int) (Math.pow(2, i) - 1)) == 0) {
			  return dumbMove();
		  }

	  return WONT_GET_THERE;
  }
   /**
   * Definerer computerens dumme valg af kugler den tager fra heapet.
   * @return antal kugler computeren tager fra heapet
   */
  public int dumbMove() {
    int fjern = new Random().nextInt(n.getHeap()/2)+1;
      System.out.println("Computeren fjerner " + fjern);
      return (fjern);
  }
}