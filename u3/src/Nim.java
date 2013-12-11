import java.util.Random;
import java.util.Scanner;

public class Nim {
  public static void main(String[] _) {
    Game a = new Game();
    ComputerPlayer com = new ComputerPlayer(a);
    Scanner input = new Scanner(System.in);

    a.printHeap();

    if (new Random().nextInt(2) == 1) {
      System.out.println("Du starter");
      System.out.print("Indtast et nummer mellem 1 og " +
                           (a.getHeap()/2) + ": ");
      a.remove(input.nextInt());
    }
    else
      System.out.println("Computeren starter");
       while(a.getHeap() > 0) {
      if (a.getHeap() == 1) {
         System.out.println("Du vandt");
         break;
      }
       a.remove(com.makeMove());
      System.out.print("Indtast et nummer mellem 1 og " +
          (a.getHeap()/2) + ": ");
      int inpt = input.nextInt();
      a.remove(inpt);
      if (a.getHeap() == 0) {
         System.out.println("Computeren vandt");
         break;
      }
    }
  }
}