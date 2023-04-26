class GreatestCommonDivisor {

  static int gcdNaive(int x, int y) {
    int res = Math.min(x, y);
    while (res > 0) {
      if (x % res == 0 && y % res == 0) break;
      res--;
    }
    return res;
  }

  static int gcdEff(int a, int b) {
    if (b == 0) return a; else return gcdEff(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(gcdNaive(10, 15));
    System.out.println(gcdEff(10, 15));
  }
}
