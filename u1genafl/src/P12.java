import java.util.Scanner;
/**
 * Klassen fjerner kommaer fra et vilkårligt tal og returnerer tallet uden.
 */
public class P12 {

  public static void main(String[] _) {

    System.out.print("Indtast et vilkårligt tal mellem 1000 og 999999 med kommaer: ");
     
    String result = new Scanner(System.in).next();
    result = result.replace(",","");

 
     System.out.println(result);
  }
}
