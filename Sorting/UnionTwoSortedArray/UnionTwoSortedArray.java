import java.util.Arrays;

public class UnionTwoSortedArray {

  static void unionNaive(int a[], int b[]) {
    int c[] = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
      c[a.length + i] = b[i];
    }
    Arrays.sort(c);
    for (int i = 0; i < a.length + b.length; i++) {
      if (i == 0 || c[i] != c[i - 1]) System.out.print(c[i] + " ");
    }
  }

  static void unionEff(int a[], int b[]) {
    int n = a.length, m = b.length, i = 0, j = 0;
    while (i < n && j < m) {
      if (i > 0 && a[i] == a[i - 1]) {
        i++;
        continue;
      }
      if (j > 0 && b[j] == b[j - 1]) {
        j++;
        continue;
      }
      if (a[i] < b[j]) {
        System.out.print(a[i] + " ");
        i++;
      } else if (a[i] > b[j]) {
        System.out.print(b[j] + " ");
        j++;
      } else {
        System.out.print(a[i] + " ");
        i++;
        j++;
      }
    }
    while (i < n) if (i > 0 && a[i] != a[i - 1]) {
      System.out.print(a[i] + " ");
      i++;
    }
    while (j < m) if (j > 0 && b[j] != b[j - 1]) {
      System.out.print(b[j] + " ");
      j++;
    }
  }

  public static void main(String[] args) {
    int a[] = { 10, 20, 20 };
    int b[] = { 5, 20, 40, 40 };
    // unionNaive(a, b);
    unionEff(a, b);
  }
}
