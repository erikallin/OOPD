import java.util.ArrayList;

public class Onetime extends Appointment {

  /**
   * Opretter en oneTime begivenhed.
   * @param y Årstal
   * @param m Måned
   * @param d Dag
   * @param description Beskrivelse af begivenheden
   */
  public Onetime(int y, int m, int d, String description) {
    super(y, m, d, description);
  }

  /**
   * Printer alle daily begivenheder ud.
   */
  @Override
  public void print() {

 }

  /**
   * Tjekker om der er en 'oneTime appointment' på en bestemt dato.
   * @param year Årstallet der tjekkes på.
   * @param month Måneden der tjekkes på.
   * @param day Dagen der tjekkes på.
   * @return Om der findes en aftale på den pågældende dato.
   */
 @Override
  public boolean occursOn(int year, int month, int day) {

    return this.year == year && this.month == month && this.day == day;
  }

}