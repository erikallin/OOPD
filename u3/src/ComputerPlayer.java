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

  }
  public int dumbMove(){
  return (new Random().nextInt(n.getHeap()/2)+1);

  }
}
