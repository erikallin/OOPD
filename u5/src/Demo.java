import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Demo {

  public static void main(String[] _) throws IOException {

    
    String address = "http://www.erduidiot.dk";
    URL pageLocation = new URL(address);
    Scanner in = new Scanner(pageLocation.openStream());
    File f = new File("Output.txt");
    while (in.hasNext("")) {
       String line = in.next();   
     
          int from = line.indexOf("\"");
          int to = line.lastIndexOf("\"");
          System.out.print(line);
       
           
       
       
       StringBuffer sb = new StringBuffer(line);
    try {
      FileWriter write = new FileWriter(f);
      BufferedWriter bwriter = new BufferedWriter(write);
      bwriter.write(sb.toString());
      if (!(in.hasNext()))
        bwriter.close();
    }
    catch(Exception e){}
    
    
  
    }
    
  }

}
