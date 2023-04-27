public class PrimeFactors {

  static void primeFactorsNaive(int n) {
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        int x = i;
        while (n % x == 0) {
          System.out.print(i + " ");
          x = x * i;
        }
      }
    }
  }

  static boolean isPrime(int x) {
    if (x == 1) return false;
    if (x == 2 || x == 3) return true;
    if (x % 2 == 0 || x % 3 == 0) return false;
    for (int i = 5; i * i <= x; i = i + 6) {
      if (x % i == 0 || x % (i + 2) == 0) return false;
    }
    return true;
  }

  static void primeFactorsEff(int n) {
    if (n <= 1) return;
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n = n / i;
      }
    }
    if (n > 1) System.out.print(n + " ");
  }

  static void primeFactorsMostEff(int n) {
    if (n <= 1) return;
    while (n % 2 == 0) {
      System.out.print(2 + " ");
      n = n / 2;
    }
    while (n % 3 == 0) {
      System.out.print(3 + " ");
      n = n / 3;
    }
    for (int i = 5; i * i <= n; i = i + 6) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n = n / i;
      }
      while (n % (i + 2) == 0) {
        System.out.print(i + " ");
        n = n / (i + 2);
      }
    }
    if (n > 3) System.out.print(n + " ");
  }

  public static void main(String[] args) {
    // primeFactorsNaive(12);
    // primeFactorsEff(12);
    primeFactorsMostEff(450);
    System.out.println();
    System.out.println();
  }
}
