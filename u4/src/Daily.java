import java.util.ArrayList;

public class Daily extends Appointment {

  /**
   * Opretter en daily begivenhed.
   * @param y Årstal
   * @param m Måned
   * @param d Dag
   * @param description Beskrivelse af begivenheden
   */
  public Daily(int y, int m, int d, String description) {
    super(y, m, d, description);
  }

  /**
   * Printer alle daily begivenheder ud.
   */
  public void print() {
    for (String i : super.getEvent("D"))
      System.out.print(i);
      System.out.println();
  }

  /**
   * Tjekker om alle daily appointments foregår på en bestemt dato.
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