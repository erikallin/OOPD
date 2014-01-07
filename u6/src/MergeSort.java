import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {


  public ArrayList<T> sort(ArrayList<T> liste) {

    /*
     * Hvis listen kun indeholder et eller ingen elementer er listen
     * trivielt sorteret.
     */
    if (liste.size() <= 1)
      return liste;

    int middle = liste.size()/2;
    ArrayList<T> left = new ArrayList<>();
    for (int i = 0; i < middle; i++)
      left.add(liste.get(i));

    ArrayList<T> right = new ArrayList<>();
    for (int i = middle;  i < liste.size(); i++)
      right.add(liste.get(i));

    return (merge(sort(left), sort(right)));
  }
/*
  public T[] sort(T[] liste) {

    if (liste.length <= 1)
      return liste;

    int middle = liste.length / 2;
    ArrayList<T> left = new ArrayList<>();
    for (int i = 0; i < middle; i++)
      left.add(liste[i]);

    ArrayList<T> right = new ArrayList<>();
    for (int i = middle;  i < liste.length; i++)
      right.add(liste[i]);



    T[] sortedList;

    ArrayList<T> a = (merge(sort(left), sort(right)));

    for (int i = 0; i < liste.length; i++)
      sortedList[i] = a.get(i);


    return sortedList;

  }
*/

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
