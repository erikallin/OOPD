import java.util.ArrayList;

public class Monthly extends Appointment {

  /**
   * Opretter en monthly begivenhed.
   * @param y Årstal
   * @param m Måned
   * @param d Begivenhed
   * @param description Beskrivelse af begivenheden
   */
  public Monthly(int y, int m, int d, String description) {
    super(y, m, d, description);
  }

  /**
   * Printer alle monthly begivenheder ud.
   */
  public void print() {
    for (String i : super.getEvent("M")) {
      System.out.print(i);
      System.out.println();
    }
  }

  /**
   * Tjekker om alle monthly appointments foregår på en bestemt dato.
   * @param year Årstallet der tjekkes på.
   * @param month Måneden der tjekkes på.
   * @param day Dagen der tjekkes på.
   * @return En liste over appointments, der findes på den pågældende dato.
   */
  public ArrayList<Appointment> occursOn(int year, int month, int day) {
    ArrayList<Appointment> occurs = new ArrayList<Appointment>();

    return occurs;
  }

}