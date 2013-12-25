import java.io.*;
import java.net.URL;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebPage {

  private final String url;
  private final String file;

  public WebPage(String url, String file) {
    this.url = url;
    this.file = file;
  }

  /**
   * Skriver alle links ud.
   * @param fil Den ønskede fil man vil finde hyperlinks i.
   */
  public static void getLinks(String fil) throws FileNotFoundException {
    ArrayList<String> urlListe = new ArrayList<>();
    String tmp = "";

    String regexPattern = ("<a href(.*?)/>|<a href(.*?)</a>");
    Pattern pattern = Pattern.compile(regexPattern);
    Scanner t = new Scanner(new FileReader(fil));

    while (t.hasNextLine())
      tmp+=t.nextLine();

    Matcher matcher = pattern.matcher(tmp); 
    
   while (matcher.find())
     System.out.println(matcher.group(0));
  }

  
  /**
   * Printer en URL's (der er gemt ned på en .html fil) data.
   */
  public void print() throws FileNotFoundException {
    Scanner p = new Scanner(new FileReader(file));
    while (p.hasNext())
      System.out.println(p.nextLine());
  }

  /**
   * Skriver en URL's data ned til en .html fil.
   */
  public void storeAsText() throws IOException {
    URL pageLocation = new URL(this.url);
    BufferedWriter writer;

    writer = new BufferedWriter(new FileWriter(file));
    Scanner in = new Scanner(pageLocation.openStream());

    while (in.hasNext()) {
      String line = in.nextLine();

      if (in.hasNext())
        writer.write(line + "\n");
      else
        writer.write(line);
    }
    writer.close();
    in.close();
  }

  /**
   * Endnu ikke implementeret
   */
  public void loadAsText() {

  }

}
