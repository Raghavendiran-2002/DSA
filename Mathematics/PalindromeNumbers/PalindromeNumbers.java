class PalindromeNumbers {

  static boolean isPalindrome(int x) {
    int res = 0;
    int temp = x;
    while (temp > 0) {
      int ld = temp % 10;
      res = res * 10 + ld;
      temp = temp / 10;
    }
    return x == res;
  }

  public static void main(String[] args) {
    System.err.println(isPalindrome(121));
  }
}
