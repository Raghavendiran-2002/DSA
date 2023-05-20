import java.util.HashSet;

public class UnionTwoUnsortedArrays {

  static int unionEff(int a[], int b[]) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for (int i : a) hs.add(i);
    for (int i : b) hs.add(i);
    return hs.size();
  }

  public static void main(String[] args) {
    int a1[] = { 10, 20, 10 };
    int b1[] = { 5, 10, 5 };
    System.out.println(unionEff(a1, b1));
  }
}
