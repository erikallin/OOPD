import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    while(a.gameOver()) {
      a.printHeap();
    }


  }
}
