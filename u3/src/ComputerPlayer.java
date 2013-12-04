import java.util.Random;

public class ComputerPlayer {

  public ComputerPlayer(boolean difficulty) {
    Game n = new Game();

    difficulty ? smartMove() : dumbMove();
  }
  public void smartMove(){

  }
  public void dumbMove(){
  int antal = Random.nextint(n.getHeap()/2)+1;
  n.remove(antal);
  
  }
}
