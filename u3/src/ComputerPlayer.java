import java.util.Random;

public class ComputerPlayer {

  private Game n = new Game();

  public ComputerPlayer(boolean difficulty) {
//    n = new Game();

    if (difficulty)
     smartMove();
   else
     dumbMove();
  }
  public void smartMove(){
    if (n.getHeap() <= 3)
      n.remove (n.getHeap() - 1);
    else if (n.getHeap() > 3 && n.getHeap() <= 7)
      n.remove (n.getHeap() - 3);
    else if (n.getHeap() > 7 && n.getHeap() <= 15)
      n.remove (n.getHeap() - 7);
    else if (n.getHeap() > 15 && n.getHeap() <= 31)
      n.remove (n.getHeap() - 15);
    else if (n.getHeap() > 31 && n.getHeap() <= 63)
      n.remove (n.getHeap() - 31);
    else
      n.remove (n.getHeap() - 63);
      
  }
  public int dumbMove(){
  return (new Random().nextInt(n.getHeap()/2)+1);

  }
}
