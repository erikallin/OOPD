import java.util.Random;

public class ComputerPlayer {

  private Game n;

  public ComputerPlayer(boolean difficulty) {
    n = new Game();

    if (difficulty)
     smartMove();
   else
     dumbMove();
  }
  public void smartMove(){

  }
  public void dumbMove(){
  int antal = new Random().nextInt(n.getHeap()/2)+1;
  n.remove(antal);

  }
}
