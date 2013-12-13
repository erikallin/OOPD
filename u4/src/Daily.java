public class Daily extends Appointment {

  public Daily(int y, int m, int d, String description) {
    super(y, m, d, description);
  }

    public void print() {
    for (String i : super.getEvent("D"))
      System.out.print(i);
  }




}