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

  /**
   * Tjekker om der befinder sig en begivenhed på den pågældende dag.
   *
   * @param year Årstallet begivenheden finder sted i.
   * @param month Måneden begivenheden finder sted i.
   * @param day Dagen begivenheden finder sted i.
   * @return listen over begivenheder der finder sted på den pågældende dag.
   */
  public abstract boolean occursOn(int year, int month, int day);

  /**
   * Printer alle aftaler
   */
  public abstract void print();
}
