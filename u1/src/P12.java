import java.util.Scanner;
/**
 * Klassen fjerner kommaer og returnerer tallet uden
 */
public class P12 {

  /**
   * Hvis programmet bliver kørt med ét argument vil den bruge dette som input, ellers bliver der spurgt efter et.
   * @param args argumenter som bliver taget med ind i programmet ved start.
   */
  public static void main(String[] args) {
    String result="";
    String[] tmpStringArray;

    if(args.length != 1) {
      System.out.print("Indtast et nummer: ");
      tmpStringArray = (new Scanner(System.in).next()).split(",");
    }
    else
      tmpStringArray = args[0].split(",");


    for(String i : tmpStringArray)
      result+=i;

    System.out.println(result);
  }
}
