import java.util.Scanner;
/**
 * Klassen fjerner kommaer fra et vilkårligt tal og returnerer tallet uden.
 */
public class P12 {

  public static void main(String[] _) {

    System.out.print("Indtast et vilkårligt tal mellem 1000 og 999999 med kommaer: ");
     
    String result = new Scanner(System.in).next();
    int last =  result.length();
    result = result.replace(",","");

   // BONUS: Hvis tallet ikke er i intervallet printes "Ugyldigt input".
   if (last > 3 && last < 7) 
   {
    System.out.println(result); 
   }
   else 
   { 
     System.out.println("Ugyldigt input");
   }
  }
}
