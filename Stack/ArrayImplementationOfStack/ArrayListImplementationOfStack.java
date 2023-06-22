import java.util.ArrayList;

public class ArrayListImplementationOfStack {

  public static void main(String[] args) {
    StackArrayList s = new StackArrayList();
    s.push(10);
    s.push(20);
    System.out.println(s.peek());
    s.push(40);
  }
}

class StackArrayList {

  ArrayList<Integer> al = new ArrayList<>();

  void push(int x) {
    al.add(x);
  }

  int peek() {
    return al.get(al.size() - 1);
  }

  int pop() {
    int res = al.get(al.size() - 1);
    al.remove(al.size() - 1);
    return res;
  }

  int size() {
    return al.size();
  }

  boolean isEmpty() {
    return al.isEmpty();
  }
}
