import java.util.ArrayList;
import java.io.Serializable;


public class Appointment implements Serializable {
  protected int year, month, day;
  private ArrayList<Daily> appointments;


  public Appointment(int date, String description) {
    appointments = new ArrayList<Daily>();
    //appointments.add(1, "");
    //new FileOutputStream("Kalender.txt");

  }

 //public Appointments()

 public void SkrivTilFil(int input) {

 }



  public boolean occursOn(int year, int month, int day) {

    //if (year == randomYear && month == randomMonth && day == lolDay)

    return true;
  }



}
