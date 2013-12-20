import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

  public static void test(String fil) throws FileNotFoundException {
    ArrayList<String> urlListe = new ArrayList<>();
    String tmp = "";
    Pattern pattern = Pattern.compile("<a href=(.*?)</a>");
    Scanner t = new Scanner(new FileReader(fil));

    int i = 0;

    while (t.hasNextLine())
      tmp+=t.nextLine();

    Matcher matcher = pattern.matcher(tmp);
   
   while (matcher.find())
     System.out.println(matcher.group(0));
  }

  public void print() throws FileNotFoundException {
    Scanner p = new Scanner(new FileReader(file));
    while (p.hasNext())
      System.out.println(p.nextLine());
  }

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

  public void loadAsText() {

  }

}
