import java.util.Arrays;

public class LeftmostNonrepeatingElement {

  static int nonRep(String str) {
    for (int i = 0; i < str.length(); i++) {
      boolean flag = false;
      for (int j = 0; j < str.length(); j++) {
        if (i != j && str.charAt(i) == str.charAt(j)) {
          flag = true;
          break;
        }
      }
      if (flag == false) return i;
    }
    return -1;
  }

  static final int CHAR = 256;

  static int nonRepEff(String str) {
    int[] fI = new int[CHAR];
    Arrays.fill(fI, -1);

    for (int i = 0; i < str.length(); i++) {
      if (fI[str.charAt(i)] == -1) fI[str.charAt(i)] = i; else fI[str.charAt(
          i
        )] =
        -2;
    }
    int res = Integer.MAX_VALUE;
    for (int i = 0; i < CHAR; i++) {
      if (fI[i] >= 0) res = Math.min(res, fI[i]);
    }
    return (res == Integer.MAX_VALUE) ? -1 : res;
  }

  public static void main(String args[]) {
    String str = "geeksforgeeks";
    System.out.println("Index of leftmost non-repeating element:");
    System.out.println(nonRep(str));
  }
}
