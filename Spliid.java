import java.util.Scanner;

/**
 * Denne klasse er egentlig fuldstændig retarderet, men den hedder jo også
 * Spliid. Underligt nok kaster den ikke fejl hele tiden.
 */
public class Spliid {

  private final static boolean SPLIID = true;
  public Spliid() {}

  /**
   * Ser om Spliid er sand eller falsk.
   * @return true da det er fucked kode
   */
  public boolean whatSauceryIsThis() {
    if (SPLIID)
      return (SPLIID) ? SPLIID : SPLIID;
    else
      return (!SPLIID) ? SPLIID : !SPLIID;
  }

  public static void main(String[] _) {

    System.out.println("Er spliid en Spliid: " +
        (new Spliid()).whatSauceryIsThis());

    System.out.print("Synes du at spliid er en Spliid også? ");
    String ja = (new Scanner(System.in).next());

    if (ja.equals("ja"))
      System.out.println("Godt at du også synes det!");
    else
      System.out.println("Der er noget galt med dig! Søg hjælp omgående!");
  }

}
