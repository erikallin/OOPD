import java.util.ArrayList;
import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

public class Calendar implements Serializable {

  public static void main(String[] _)
 throws IOException,
      ClassNotFoundException {

    System.out.println("Velkommen til kalenderen");
    String input;
    ArrayList<Appointment> random = new ArrayList<>();

    while (true) {
      System.out.println("Hvad vil du foretage dig? \n"
          + "q = Luk programmet. \n" + "t = Tilføj begivenhed. \n"
          + "f = Find begivenhed på dato.");

      input = (new Scanner(System.in)).next();
      
      if (input.equals("t")) {
        
        String[] userData = (new Scanner(System.in)).next().split(",");
        
        random.add(new Daily(Integer.parseInt(userData[0]),
                             Integer.parseInt(userData[1]), 
                             Integer.parseInt(userData[2]), 
                             userData[3]));
                
        // Skriv til filen "Kalenderfil.csv"
        try {
          File f = new File("Kalenderfil.csv");
          ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(f));
          outStream.writeObject(random.get(0));
          outStream.close();
        }
        catch(Exception e){}

        // Læs fra filen "Kalenderfil.csv"
        Appointment anotherObject = new Daily(3, 2, 1900, "Læser fra fil");
        try {
          File f = new File("Kalenderfil.txt");    
          ObjectInputStream inStream =
                new ObjectInputStream(new FileInputStream(f));
          anotherObject = (Appointment) inStream.readObject();
          inStream.close();
        }
        catch(Exception e){}


        System.out.println(anotherObject.get());
        }
      
     

      if (input.equals("q")) {
        System.out.println("Programmet lukkes");
        break;
      }
    }

    Appointment test = new Monthly(1,2,3,"Test");

    test.print();

  }
}
