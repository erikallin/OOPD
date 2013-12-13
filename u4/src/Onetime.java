public class Onetime extends Appointment {

  public Onetime(int y, int m, int d, String description) {
    super(y, m, d, description);
  }

  public void print() {
    for (String i : super.getEvent("O"))
      System.out.print(i);
  }
}