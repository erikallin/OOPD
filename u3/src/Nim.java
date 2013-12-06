import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    ComputerPlayer com = new ComputerPlayer(false);

    Scanner input = new Scanner(System.in);

    a.printHeap();

    while(a.getHeap() != 0) {
      a.remove(input.nextInt());
      a.remove(com.makeMove());
    }

  }
}
