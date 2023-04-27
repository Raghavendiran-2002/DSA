public class AllDivisorOfNumber {

  static void printDivisorsNaive(int n) {
    for (int i = 1; i <= n; i++) {
      {
        if (n % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }

  static void printDivisorsEff(int n) {
    int i;
    for (i = 1; i * i < n; i++) {
      if (n % i == 0) System.out.print(i + " ");
    }
    for (; i >= 1; i--) {
      if (n % i == 0) System.out.print(n / i + " ");
    }
  }

  public static void main(String[] args) {
    // printDivisorsNaive(25);
    printDivisorsEff(15);
  }
}
