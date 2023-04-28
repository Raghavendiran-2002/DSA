public class TailRecursion {

  static void fun1(int n) { // Tail Recursive
    // uses Tail call Elimination
    if (n == 0) return;
    System.out.print(n + " ");
    fun1(n - 1);
  }

  static void fun2(int n) { // Not Tail Recursive
    if (n == 0) return;
    fun2(n - 1);
    System.out.print(n + " ");
  }

  static int fact1(int n) {
    if (n == 0 || n == 1) return 1;
    return n * fact1(n - 1);
  }

  static int fact2(int n, int k) {
    if (n == 0 || n == 1) return k;
    return fact2(n - 1, n * k);
  }

  // Converting the above Not Tail Recursive to Tail call Recursive
  static void fun3(int n, int k) { // Initially pass k = 1
    if (n == 0) return;
    System.out.print(k + " ");
    fun3(n - 1, k + 1);
  }

  public static void main(String[] args) {
    System.out.println(fact1(4));
    System.out.println(fact2(4, 1));
  }
}
