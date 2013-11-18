import java.util.Scanner;

public class P13 {

  public static void main(String[] args) {
	String aa = "";
	String result = "";
	System.out.print("Indtast et nummer: ");

    aa = (new Scanner(System.in).next());

    switch (aa.length()) {
      case 4:
        result = aa.substring(0,1) + "," + aa.substring(1);
        break;
      case 5:
        result = aa.substring(0,2) + "," + aa.substring(2);
        break;
      case 6:
        result = aa.substring(0,3) + "," + aa.substring(3);
        break;
      default:
        result = "Ugyldigt input";
        break;
	  }

	  System.out.println(result);
  }

}