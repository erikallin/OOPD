import java.util.Scanner;
import java.util.ArrayList;

public abstract Appointment {
  private ArrayList<String> list = new ArrayList<String>();
  private int year, month, day;
  private String appointment;
  
  public Appointment() {
  
  }
  
  public void setYear(int y) {
    this.year = y;
  }
  
  public void setMonth(int m) {
    this.month = m;
  }
  
  public void setDay(int d) {
    this.day = d;
  }

  public String occursOn(int year, int month, int day) {
    return "TODO";
  }
}