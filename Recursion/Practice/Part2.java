class Part2 {

  static int fun1(int n) {
    if (n == 1) return 0; else return 1 + fun1(n / 2);
  }

  static void fun2(int n) {
    if (n == 0) return;
    fun2(n / 2);
    System.out.println(n % 2);
  }

  public static void main(String[] args) {
    // System.out.println(fun1(16));
    fun2(7);
  }
}
