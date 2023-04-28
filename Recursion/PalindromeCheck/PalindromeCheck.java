public class PalindromeCheck {

  static boolean checkPalindrome(String str, int start, int end) {
    if (start >= end) return true;
    return (
      str.charAt(start) == str.charAt(end) &&
      checkPalindrome(str, start + 1, end - 1)
    );
  }

  public static void main(String[] args) {
    System.out.println(checkPalindrome("mom", 0, 2));
  }
}
