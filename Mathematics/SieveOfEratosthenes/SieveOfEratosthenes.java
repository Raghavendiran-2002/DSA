import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

  static void sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
        for (int j = i * i; j <= n; j = j + i) {
          isPrime[j] = false;
        }
      }
    }
  }

  static boolean isPrime(int n) {
    if (n == 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i = i + 6) {
      if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    sieve(30);
  }
}
