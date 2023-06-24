import java.util.ArrayDeque;

public class PostfixToInfix {

  static void posttoinf(String str) {
    ArrayDeque<String> s = new ArrayDeque<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '+' || c == '-' || c == '/' || c == '*' || c == '^') {
        s.push("(" + s.pop() + c + s.pop() + ")");
      } else {
        s.push(c + "");
      }
    }
    System.out.println(s.peek());
  }

  public static void main(String[] args) {
    posttoinf(" abc/+de*-");
  }
}
