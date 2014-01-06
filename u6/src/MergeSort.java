import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {


  public ArrayList<T> sort(ArrayList<T> liste) {

    /*
     * Hvis listen kun indeholder et eller ingen elementer er listen
     * trivielt sorteret.
     */
    if (liste.size() <= 1)
      return liste;

    ArrayList<T> first = new ArrayList<>();
    for (int i = 0; i < liste.size()/2; i++)
      first.add(liste.get(i));

    ArrayList<T> second = new ArrayList<>();
    for (int i = 0;  i < liste.size() - first.size(); i++)
      second.add(liste.get(first.size() + i));

    first = sort(first);
    second = sort(second);

    return first;
  }

  public <T> void sort(T[] liste) {

    if (liste.length <= 1)
      return;


  }

  private ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
    ArrayList<T> merged = new ArrayList<>();

    while (left.size() > 0 || right.size() > 0) {
      if (left.size() > 0 && right.size() > 0) {
        if (left.get(0).compareTo(right.get(0)) > 0) {
          merged.add(left.get(0));
          left.remove(0);
        }
        else {
          merged.add(right.get(0));
          right.remove(0);
        }
      }
      else if (left.size() > 0) {
          merged.add(left.get(0));
          left.remove(0);
      }
      else if (right.size() > 0) {
        merged.add(right.get(0));
        right.remove(0);
      }

    }
    return merged;
  }

}
