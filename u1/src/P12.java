import java.util.Scanner;
/**
 * Klassen fjerner kommaer fra et vilkårligt tal og returnerer tallet uden.
 */
public class P12 {

  /**
   * Hvis programmet bliver kørt med ét argument vil den bruge dette som input, 
   * hvis ikke, så bliver der spurgt efter et.
   * @param args argumenter som bliver taget med ind i programmet ved start.
   */
  public static void main(String[] args) {
    String result="";
    String[] tmpStringArray;
/*
 * Hvis mængden af inputs er forskellig fra 1, så bedes der om et tal.
 */
    if(args.length != 1) {
      System.out.print("Indtast et tal: ");
      tmpStringArray = (new Scanner(System.in).next()).split(",");
    }
    else
      tmpStringArray = args[0].split(",");

// Går videre til næste tegn
    for(String i : tmpStringArray)
      result+=i;

    System.out.println(result);
  }
}
