class LCM {

  static int lcmNaive(int a, int b) {
    int res = Math.max(a, b);
    while (true) {
      if (res % a == 0 && res % b == 0) return res;
      res++;
    }
    // return res;
  }

  static int lcmEff(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  static int gcd(int a, int b) {
    if (b == 0) return a; else return gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(lcmNaive(4, 6));
    System.out.println(lcmEff(4, 6));
  }
}
