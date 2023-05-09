public class MergeTwoSortedArrays {

  static void merge(int a[], int b[]) {
    int n = a.length, m = b.length;
    int i = 0, j = 0;
    while (i < n && j < m) {
      if (a[i] <= b[j]) {
        System.out.print(a[i] + " ");
        i++;
      } else {
        System.out.print(b[j] + " ");
        j++;
      }
    }
    while (i < n) {
      System.out.print(a[i] + " ");
      i++;
    }
    while (j < n) {
      System.out.print(b[j] + " ");
      j++;
    }
  }

  public static void main(String[] args) {
    int a[] = { 10, 20, 50 };
    int b[] = { 5, 50, 50 };
    merge(a, b);
  }
}
