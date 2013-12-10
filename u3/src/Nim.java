import java.util.Scanner;

public class Nim {

  public static void main(String[] _) {

    Game a = new Game();

    ComputerPlayer com = new ComputerPlayer(a);


    Scanner input = new Scanner(System.in);
    a.printHeap();

    while(a.getHeap() > 0) {
      System.out.print("Indtast et nummer mellem 1 og " +
                        (a.getHeap()/2) + ": ");
      a.remove(input.nextInt());
      a.remove(com.makeMove(1));
    }

  }
}
