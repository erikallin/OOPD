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
 }

  /**
   * Tjekker om alle daily appointments foregår på en bestemt dato.
   * @param year Årstallet der tjekkes på.
   * @param month Måneden der tjekkes på.
   * @param day Dagen der tjekkes på.
   * @return Om der findes en aftale på den pågældende dato.
   */
  public boolean occursOn(int year, int month, int day) {

    return super.year >= year && super.month >= month && super.day >= day;
  }

}
