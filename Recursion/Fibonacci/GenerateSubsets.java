public class GenerateSubsets {

  static void generateString(String str, String curr, int index) {
    if (index == str.length()) {
      System.out.print(curr + " ");
      return;
    }
    generateString(str, curr, index + 1);
    generateString(str, curr + str.charAt(index), index + 1);
  }

  public static void main(String[] args) {
    generateString("abc", "", 0);
  }
}
