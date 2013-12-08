import java.util.Random;

public class Game {

  private int heap;
  /*
  * Starter spillet med at generere en integer mellem 10 og 100, der angiver
  * størrelsen på heapet.
  */

  public Game() {
    this.heap = new Random().nextInt(90) + 10;
  }

  /*
  * Printer heapets størrelse.
  */
  public void printHeap() {
    System.out.println("Heapets størrelse er: " + this.heap);
  }

  public int getHeap() {
    return this.heap;
  }

  /**
  * Tjekker om der er et 'lovligt' antal kugler.
  * @param number Den integer, der skal være lovlig.
  * @return om number er en logliv integer.
  */
  public boolean isLegit(int number) {
    return ((number > 0 && number <= heap / 2) || number == 1);
  }
/**
 * Hvis ovenstående isLegit er true trækkes der det antal kugler fra,
 * som der er blevet valgt.
 * Hvis false, så printes der, at det er et ugyldigt træk.
 * @param number Antal kugler, der skal trækkes fra heapet, hvis det er
 * en lovlig integer.
 */
  public void remove(int number) {
    if (isLegit(number)) {
      this.heap -= number;
      this.printHeap();

    }
    else
      System.out.println("Ugyldigt træk! prøv igen: ");
  }

}
