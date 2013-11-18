import java.util.Scanner;
/**
 * A class which removes "," from an input and prints the number.
 */
public class P12 {

  /**
   * If a number is given as an argument it will use that else it will
   * ask for a number.
   * @param args
   */
  public static void main(String[] args) {
    String result="";
    String[] aa;

    if(args.length != 1) {
      System.out.print("Indtast et nummer: ");
      aa = (new Scanner(System.in).next()).split(",");
    }
    else {
      aa = args[0].split(",");
    }
    
    for(String i : aa)
    	result+=i;

    System.out.println(result);
  }
}