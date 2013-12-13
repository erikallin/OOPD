
import java.util.ArrayList;
import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

public class Calendar implements Serializable {

  public static void main(String[] _)
    throws IOException, ClassNotFoundException {
    //Appointment a = new Daily(1, "LEL");

    ArrayList<String> appointments = new ArrayList<String>();
   // System.out.println(System.getProperty("KalenderFil.txt"));


      File f = new File("KalenderFil.txt");
      Charset UTF8 = Charset.forName("UTF-8");
      Writer writer = new OutputStreamWriter (new FileOutputStream(f), UTF8);
      writer.write("Hej med dig");
      writer.close();


/* ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(f), UTF8);
      outStream.writeObject("Bf\n ost \n lol");
      outStream.close(); */
/*
      String x = "";
  ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
  for (int i = 0; i < 1; i++)
    x += i;
  //a = (Daily) in.readObject();
  in.close();
*/


      BufferedReader br = new BufferedReader(new FileReader("KalenderFil.txt"));
      String x = "trooloololol";

      while(br.readLine() != null)
        System.out.println(br.readLine());

  }
  ArrayList appointment = new ArrayList();

       //appointment.add(Daily());
}
