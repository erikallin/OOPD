import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Demo {

  public static void main(String[] _) throws IOException {

    ArrayList<String> text = new ArrayList<>();
    String input;
    WebPage a = null;
    String file;
    String url;
    String prompt = "Hvad vil du foretage dig? \n"
        + "s = Skriv et nyt URL's data til en fil \n"
        + "l = Print alle hyperlinks fra en eksisterende fil\n"
        + "p = Print den seneste URL's data. \n" + "q = Luk programmet";

    System.out.println("Hvad vil du foretage dig? \n"
        + "s = Skriv et URL's data til en fil \n"
        + "l = Print alle hyperlinks fra en eksisterende fil\n"
        + "q = Luk programmet\n"
        + "h = Hent en lokal fil");
    while (!(input = new Scanner(System.in).next()).equals("q")) {

      if (input.equals("s")) {
        System.out.print("Skriv venligst en URL: ");
        url = "http://" + (new Scanner(System.in)).next();
        System.out.print("Skriv venligst et filnavn : ");
        file = (new Scanner(System.in)).next() + ".html";
        a = new WebPage(url, file);
        a.storeAsText();
        System.out.println("Filen er skrevet til " + file);
        System.out.println(prompt);
      }

      if (input.equals("p")) {
        System.out.print("Skriv venligst et filnavn: ");
        String fil = (new Scanner(System.in)).next();
        WebPage.print(fil);
        System.out.println(prompt);
      }

      if (input.equals("l")) {
        System.out.print("Indtast venligst filnavn: ");
        String links = (new Scanner(System.in)).next();
        WebPage.getLinks(links + ".html");
        System.out.println(prompt);
      }

      if (input.equals("h")) {
        System.out.print("Indtast venligst filnavn: ");
        String in = (new Scanner(System.in)).next();
        text = WebPage.loadAsText(in + ".html");

        System.out.println(prompt);
      }
    }
  }
}
