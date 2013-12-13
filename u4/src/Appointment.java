import java.util.ArrayList;
import java.io.*;



public abstract class Appointment {
  protected int year, month, day;
  protected String description;



  public Appointment(int year, int month, int day, String description) {
    this.day = day;
    this.month = month;
    this.year = year;
    this.description = description;
  }


  public ArrayList<String> getEvent(String t) {
    ArrayList<String> tard = new ArrayList<String>();

    String[] type;
    try {
    BufferedReader br = new BufferedReader(new FileReader("KalenderFil.csv"));
    String line = br.readLine();

    while (line != null) {
      type = line.split(";");
      if (t.equals(type[4]))
        tard.add(line);
    }


    }
    catch(Exception e) {}


    return tard;
  }


  public void makeOneTime (char[] enGang) {


  }


  public boolean occursOn(int year, int month, int day) {

    return true;
  }

  public abstract void print();
}