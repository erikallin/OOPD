public class Monthly extends Appointment {

  public Monthly(int y, int m, int d, String description) {
    super(y, m, d, description);
  }
  public void print() {
    for (String i : super.getEvent("M")) {
      System.out.print(i);
      System.out.println();
    }
  }

}