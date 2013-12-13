import java.util.ArrayList;
import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

public class Calendar implements Serializable {

  public static void main(String[] _)
    throws IOException, ClassNotFoundException {

    ArrayList<String> appointments = new ArrayList<String>();

    int d, m, y;
    String dis, occ;
    File f = new File("KalenderFil.csv");
    Charset UTF8 = Charset.forName("UTF-8");
    Scanner input = new Scanner(System.in);

    if (!f.exists()) {
      FileOutputStream fos = new FileOutputStream(f);
      Writer writer = new OutputStreamWriter(fos, UTF8);
      writer.close();
    }
    FileOutputStream fos = new FileOutputStream(f, true);
    Writer writer = new OutputStreamWriter(fos, UTF8);
    System.out.print("Day: ");
    d = input.nextInt();
    System.out.print("Month: ");
    m = input.nextInt();
    System.out.print("Year: ");
    y = input.nextInt();
    System.out.print("Description: ");
    input.nextLine();
    dis = input.nextLine();
    System.out.print("O - One Time\nD - Daily\nM - Monthly: ");
    occ = input.nextLine();
    input.close();

    writer.write(d + ";" + m + ";" + y + ";" + dis + ";" + occ + "\n");
    writer.close();

    BufferedReader br = new BufferedReader(new FileReader(f));
    String line = br.readLine();

    while (line != null) {
      for (String i : line.split(";"))
        System.out.print(i + " ");

      line = br.readLine();
      System.out.println();
    }

  Appointment aa = new Monthly(1,2,3,"Fuck");

  aa.print();


  }

}