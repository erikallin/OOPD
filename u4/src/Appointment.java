import java.util.ArrayList;
import java.io.*;

public abstract class Appointment {

  protected int year, month, day;
  protected String description;

  /**
   * Definerer en appointment/begivenhed.
   *
   * @param year Årstallet begivenheden finder sted i.
   * @param month Måneden begivenheden finder sted i.
   * @param day Dagen begivenheden finder sted i.
   * @param description Beskrivelsen af begivenheden.
   */
  public Appointment(int year, int month, int day, String description) {
    this.day = day;
    this.month = month;
    this.year = year;
    this.description = description;
  }

  /**
   * Returnerer appointments fra eks. en bestemt dato.
   *
   * @param t Eks. den dato der hentes appointments fra.
   * @return En liste over appointments fra den pågældende dato.
   */
  public ArrayList<String> getEvent(String t) {
    ArrayList<String> events = new ArrayList<String>();

    String[] type;
    try {
      BufferedReader br = new BufferedReader(new FileReader("KalenderFil.csv"));
      String line = br.readLine();

      while (line != null) {
        type = line.split(";");
        for (String i : type) {
          if (t.equals(type[4])) {
            events.add(line.replace(";", " "));
          }

          line = br.readLine();
        }
      }
    } catch (Exception e) {
    }

    return events;
  }

  /**
   * Tjekker om der befinder sig en begivenhed på den pågældende dag.
   *
   * @param year Årstallet begivenheden finder sted i.
   * @param month Måneden begivenheden finder sted i.
   * @param day Dagen begivenheden finder sted i.
   * @return listen over begivenheder der finder sted på den pågældende dag.
   */
  public abstract ArrayList<Appointment> occursOn(int year, int month, int day);

  public abstract void print();
}
