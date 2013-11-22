import java.util.Scanner;
/**
 *  Klassen tilføjer kommaer til et vilkårligt tal og returnerer tallet.
 */
public class P13 {

  public static void main(String[] args) {

    String result;
    System.out.print("Indtast et nummer: ");

    String input = new Scanner(System.in).next();

    switch (input.length()) {
      case 4:
        result = input.substring(0, 1) + "," + input.substring(1);
        break;
      case 5:
        result = input.substring(0, 2) + "," + input.substring(2);
        break;
      case 6:
        result = input.substring(0, 3) + "," + input.substring(3);
        break;
      default:
        result = "Ugyldigt input";
        break;
    }

    System.out.println(result);
  }

}