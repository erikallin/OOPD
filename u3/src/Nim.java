import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    a.printHeap();

    while(!(a.gameOver())) {
      a.remove(new Scanner(System.in).nextInt());
      com.remove();
    }

  }
}
