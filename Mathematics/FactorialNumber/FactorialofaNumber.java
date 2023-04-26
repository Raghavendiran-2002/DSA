class FactorialofaNumber {

  static int factR(int x) {
    if (x <= 0) return 1;
    return x * factR(x - 1);
  }

  static int factI(int x) {
    int res = 1;
    for (int i = 2; i <= x; i++) {
      res = res * i;
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(factR(5));
    System.out.println(factI(5));
  }
}
