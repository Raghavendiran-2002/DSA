import java.util.HashSet;

public class IntersectionTwoUnsortedArrays {

  private static void intersectArrays(int a[], int b[]) {
    HashSet<Integer> hs = new HashSet<Integer>();

    for (int k : a) {
      hs.add(k);
    }
    for (int i = 0; i < b.length; i++) {
      if (hs.contains(b[i])) {
        System.out.print(b[i] + " ");
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 10, 20, 30 };
    int b[] = { 10, 30 };
    intersectArrays(a, b);
  }
}
