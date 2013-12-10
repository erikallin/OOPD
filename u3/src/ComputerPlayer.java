import java.util.Random;

public class ComputerPlayer {

  private Game n;

  public ComputerPlayer(Game n) {
    this.n = n;
    /*
    if (difficulty)
     smartMove();
   else
     dumbMove();
     */
  }

  /**
   * Bestemmer om computeren foretager et smart eller dumt valg.
   * @param difficulty Computerens sværhedsgrad
   * @return hvorvidt computeren foretager et smartMove eller et dumbMove.
   */
  public int makeMove(int difficulty) {
    if (difficulty == 1){
      System.out.println("Computeren tror heapets størrelse er " + n.getHeap());
      return smartMove();
    }
    else
      System.out.println("Computeren tror heapets størrelse er " + n.getHeap());
      return dumbMove();
  }

  /**
   * Definerer computerens smarte valg af kugler den tager fra heapet.
   * @return antal kugler computeren tager fra heapet
   */
  public int smartMove(){

    if (n.getHeap() == 3 || n.getHeap() == 7 || n.getHeap() == 15 ||
        n.getHeap() == 31 || n.getHeap() == 63)
       return dumbMove();

    else if (n.getHeap() < 3) {
      System.out.println("Computeren fjerner 1");
      return 1;
    }
    else if (n.getHeap() < 7) {
      System.out.println("Computeren fjerner " + (n.getHeap() - 3));
      return (n.getHeap() - 3);
    }
    else if (n.getHeap() < 15) {
      System.out.println("Computeren fjerner " + (n.getHeap() - 7));
      return (n.getHeap() - 7);
    }
    else if (n.getHeap() < 31) {
      System.out.println("Computeren fjerner " + (n.getHeap() - 15));
      return (n.getHeap() - 15);
    }
    else if (n.getHeap() < 63) {
      System.out.println("Computeren fjerner " + (n.getHeap() - 31));
      return (n.getHeap() - 31);
    }
    else {
      System.out.println("Computeren fjerner " + (n.getHeap() - 63));
      return (n.getHeap() - 63);
    }
  }
  /**
   * Definerer computerens dumme valg af kugler den tager fra heapet.
   * @return antal kugler computeren tager fra heapet
   */
  public int dumbMove() {
    int fjern = new Random().nextInt(n.getHeap()/2)+1;

 //   while (!n.isLegit(fjern)) {
   //   fjern = new Random().nextInt(n.getHeap()/2)+1;
 //   }

      System.out.println("Computeren fjerner " + fjern);
      return (fjern);

  }
}
