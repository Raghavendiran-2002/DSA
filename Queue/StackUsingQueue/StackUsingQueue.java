import java.util.ArrayDeque;

public class StackUsingQueue {

  static class Stack {

    static ArrayDeque<Integer> q1 = new ArrayDeque<>();
    static ArrayDeque<Integer> q2 = new ArrayDeque<>();

    static int curr_size;

    Stack() {
      curr_size = 0;
    }

    static void push(int x) {
      curr_size++;
      q2.add(x);
      while (!q1.isEmpty()) {
        q2.add(q1.peek());
        q1.remove();
      }
      ArrayDeque<Integer> q = q1;
      q1 = q2;
      q2 = q;
    }

    static void pop() {
      if (q1.isEmpty()) return;
      q1.remove();
      curr_size--;
    }

    static int top() {
      if (q1.isEmpty()) return -1;
      return q1.peek();
    }

    static int size() {
      return curr_size;
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(5);
    s.push(15);
    s.push(20);

    System.out.println("current size: " + s.size());
    System.out.println(s.top());
    s.pop();
    System.out.println(s.top());
    s.pop();
    System.out.println(s.top());

    System.out.println("current size: " + s.size());
  }
}
