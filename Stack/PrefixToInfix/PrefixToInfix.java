import java.util.ArrayDeque;

public class PrefixToInfix {

  static String pretoin(String str) {
    ArrayDeque<String> s = new ArrayDeque<>();
    for (int i = str.length() - 1; i >= 0; i--) {
      char c = str.charAt(i);
      if (c == '*' || c == '+' || c == '/' || c == '-' || c == '^') {
        s.push("(" + s.pop() + c + s.pop() + ")");
      } else {
        s.push(c + "");
      }
      System.out.println(s.peek());
    }
    return s.peek();
  }

  public static void main(String[] args) {
    System.out.println(pretoin("*-A/BC-/AKL"));
  }
}
