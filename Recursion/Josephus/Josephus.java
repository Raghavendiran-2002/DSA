public class Josephus {

  static int jose(int n, int k) {
    if (n == 1) return k;
    return (jose(n - 1, k) + k) % n;
  }

  public static void main(String[] args) {
    System.out.println(jose(5, 3));
  }
}
