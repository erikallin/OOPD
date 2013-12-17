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
  @Override
  public void print() {

  }

  /**
   * Tjekker om alle monthly appointments foregår på en bestemt dato.
   * @param year Årstallet der tjekkes på.
   * @param month Måneden der tjekkes på.
   * @param day Dagen der tjekkes på.
   * @return En liste over appointments, der findes på den pågældende dato.
   */
  @Override
  public boolean occursOn(int year, int month, int day) {

    return this.year >= year && this.month >= month && this.day == day;
  }

}
