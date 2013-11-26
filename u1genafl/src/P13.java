import java.util.Scanner;

/**
 * Klassen tilføjer kommaer til et vilkårligt tal og returnerer tallet. 
 */
public class P13 {

  public static void main(String[] args) {

    String result;
    System.out.print("Indtast et nummer mellem 1000 og 999999: ");

    String input = new Scanner(System.in).next();
    int last =  input.length();
    result = input.substring(0,(last-3)) + "," + input.substring((last-3),last);
    
    
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