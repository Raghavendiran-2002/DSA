class AnagramSearchNaive {

  static final int CHAR = 256;

  static boolean areAnagram(String pat, String txt, int i) {
    int[] count = new int[CHAR];
    for (int j = 0; j < pat.length(); j++) {
      count[pat.charAt(j)]++;
      count[txt.charAt(i + j)]--;
    }
    for (int j = 0; j < CHAR; j++) {
      if (count[j] != 0) return false;
    }
    return true;
  }

  static boolean isPresent(String txt, String pat) {
    int n = txt.length();
    int m = pat.length();
    for (int i = 0; i <= n - m; i++) {
      if (areAnagram(pat, txt, i)) return true;
    }
    return false;
  }

  public static void main(String args[]) {
    String txt = "geeksforgeeks";
    String pat = "frog";
    if (isPresent(txt, pat)) System.out.println(
      "Anagram search found"
    ); else System.out.println("Anagram search not found");
  }
}
