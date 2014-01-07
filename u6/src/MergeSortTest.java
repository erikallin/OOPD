import java.util.ArrayList;
import java.util.Random;

import org.junit.runner.*;
import org.junit.*;

public class MergeSortTest {

  @Test
  public void testSort() {
    ArrayList<Integer> unsorted = new ArrayList<>();

    for (int i = 0; i < 100; i++)
      unsorted.add((Integer) (new Random()).nextInt(100)+1);


    ArrayList<Integer> sorted = new ArrayList<>(MergeSort.sort(unsorted));


  }

}
