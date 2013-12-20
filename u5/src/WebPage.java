import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebPage {

  private final String url;
  private final String file;

  public WebPage(String url, String file) {
    this.url = url;
    this.file = file;
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
