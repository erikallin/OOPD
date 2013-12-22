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
   * Tjekker om der er en 'monthly appointment' på en bestemt dato.
   * @param year Årstallet der tjekkes på.
   * @param month Måneden der tjekkes på.
   * @param day Dagen der tjekkes på.
   * @return om der er en aftale på den ønskede dag.
   */
  @Override
  public boolean occursOn(int year, int month, int day) {

    return this.year >= year && this.month >= month && this.day == day;
  }


}
