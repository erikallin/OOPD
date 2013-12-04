import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    ComputerPlayer com = new ComputerPlayer(false);

    a.printHeap();

    while(!(a.gameOver())) {
      a.remove(new Scanner(System.in).nextInt());
      // Computeren skal generere trækket her og sende det til Game()
//      a.remove(3);
    }

  }
}
