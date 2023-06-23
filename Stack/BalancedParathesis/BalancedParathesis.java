import java.util.ArrayDeque;

public class BalancedParathesis {

  static boolean validParathesis(String str) {
    ArrayDeque<Character> ad = new ArrayDeque<Character>();
    for (char i : str.toCharArray()) {
      if (i == '{' || i == '(' || i == '[') {
        ad.push(i);
      } else {
        if (ad.isEmpty()) return true; else if (
          matching(ad.peek(), i) == false
        ) return false; else ad.pop();
      }
    }
    return ad.isEmpty() == true;
  }

  static boolean matching(char a, char b) {
    return (
      (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')
    );
  }

  public static void main(String[] args) {
    System.out.println(validParathesis("{({})}"));
  }
}
