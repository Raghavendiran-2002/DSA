public class TrailingZerosFactorial {

  static int countZerosNaive(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++) fact = fact * i;
    int res = 0;
    while (fact % 10 == 0) {
      res++;
      fact = fact / 10;
    }
    return res;
  }

  static int countDigitsEff(int n) {
    int count = 0;
    for (int i = 5; i <= n; i = i * 5) {
      count = count + n / i;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countDigitsEff(10));
  }
}
