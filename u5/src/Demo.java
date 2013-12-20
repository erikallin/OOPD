import java.io.IOException;
import java.util.Scanner;

public class Demo {

  public static void main(String[] _) throws IOException {

    String input;
    WebPage a = null;
    String file;
    String url;
    String prompt = "Hvad vil du foretage dig? \n"
        + "s = Skriv et nyt URL's data til en fil \n"
        + "l = Printer alle hyperlinks fra en fil\n"
        + "p = Print URL'ens data. \n" + "q = Luk programmet";

    System.out.println("Hvad vil du foretage dig? \n"
        + "s = Skriv et URL's data til en fil \n"
        + "l = Printer alle hyperlinks fra en fil\n"+ "q = Luk programmet");
    while (!(input = new Scanner(System.in).next()).equals("q")) {

      if (input.equals("s")) {
        System.out.print("Skriv venligst en URL: ");
        url = "http://" + (new Scanner(System.in)).next();
        System.out.print("Skriv venligst et filnavn: ");
        file = (new Scanner(System.in)).next() + ".html";
        a = new WebPage(url, file);
        a.storeAsText();
        System.out.println("Filen er skrevet til " + file);
        System.out.println(prompt);
      }

      if (input.equals("p")) {
        System.out.print("Skriv venligst et filnavn: ");
        a.print();
        System.out.println(prompt);
      }

      if (input.equals("l")) {
        System.out.print("Indtast venligst filnavn: ");
        String links = (new Scanner(System.in)).next();
        WebPage.test(links);
        System.out.println(prompt);
      }
    }
  }
}