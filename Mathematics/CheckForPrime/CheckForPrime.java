public class CheckForPrime {

  static boolean checkPrimeNaive(int n) {
    if (n == 1) return false;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  static boolean checkPrimeEff(int n) {
    if (n == 1) return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  static boolean checkPrimeMostEff(int n) {
    if (n == 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i = i + 6) {
      if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(checkPrimeNaive(65));
    System.out.println(checkPrimeEff(65));
    System.out.println(checkPrimeMostEff(65));
  }
}
