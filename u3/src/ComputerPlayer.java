import java.util.Random;

public class ComputerPlayer {

  private boolean isDumbfuck;
  //private Game n = new Game();

  public ComputerPlayer(boolean difficulty) {

    this.isDumbfuck = difficulty;
    /*
    if (difficulty)
     smartMove();
   else
     dumbMove();
     */
  }

  public int makeMove() {
    if (this.isDumbfuck)
      return smartMove();
    else
      return dumbMove();
  }

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

  public int dumbMove() {
    int fjern = new Random().nextInt(n.getHeap()/2)+1;

    while (!n.isLegit(fjern)) {
      fjern = new Random().nextInt(n.getHeap()/2)+1;
    }

      System.out.println("Computeren fjerner " + fjern);
      return (fjern);

  }
}
