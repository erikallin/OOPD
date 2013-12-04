import java.util.Random;
public class Game {

  private int heap;

  public Game() {

    this.heap = new Random().nextInt(90)+10;



  }

  public void printHeap() {
    System.out.println("Heapets størrelse er: " + this.heap);
  }

  public int getHeap() {
    return this.heap;
  }

  public boolean isLegit(int number) {
    return ((number > 0 && number <= heap / 2) || number == 1);
  }

  public void remove(int number) {
    if (isLegit(number)) {
      this.heap -= number;
      this.printHeap();

    }
    else
      System.out.println("Ugyldigt træk! prøv igen: ");
  }


  public boolean gameOver() {
    return (this.heap == 0);
  }

}
