import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    ComputerPlayer com = new ComputerPlayer(true);

    while(a.getHeap() != 0) {
      a.remove(new Scanner(System.in).nextInt());
      com.dumbMove();
    }

  }
}
