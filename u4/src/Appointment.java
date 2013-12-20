public abstract class Appointment {

  protected int year, month, day;
  protected String description;

  /**
   * Definerer en appointment/begivenhed.
   *
   * @param year Årstallet begivenheden finder sted på.
   * @param month Måneden begivenheden finder sted på.
   * @param day Dagen begivenheden finder sted på.
   * @param description Beskrivelsen af begivenheden.
   */
  public Appointment(int year, int month, int day, String description) {
    this.day = day;
    this.month = month;
    this.year = year;
    this.description = description;
  }

  public String get() {
    return description;
    
  }
  
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
   * Printer alle aftaler.
   */
  public abstract void print();

  }

