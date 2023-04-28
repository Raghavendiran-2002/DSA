public class RopeCutting {

  static int ropeCutting(int n, int a, int b, int c) {
    if (n == 0) return 0;
    if (n < 0) return -1;
    int res = Math.max(
      ropeCutting(n - a, a, b, c),
      Math.max(ropeCutting(n - b, a, b, c), ropeCutting(n - c, a, b, c))
    );
    if (res == -1) return -1;
    return res + 1;
  }

  public static void main(String[] args) {
    System.out.println(ropeCutting(23, 12, 14, 11));
  }
}
