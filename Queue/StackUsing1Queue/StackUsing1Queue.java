import java.util.ArrayDeque;

public class StackUsing1Queue {

  static class Queue {

    static ArrayDeque<Integer> q = new ArrayDeque<>();
    static int size;

    Queue() {
      size = 0;
    }

    static void push(int x) {
      int s = q.size();
      q.add(x);
      for (int i = 0; i < s; i++) {
        q.add(q.remove());
      }
    }

    static void pop() {
      if (q.isEmpty()) return;
      q.remove();
    }

    static int top() {
      if (q.isEmpty()) return -1;
      return q.peek();
    }

    static int size() {
      return q.size();
    }
  }

  public static void main(String[] args) {
    Queue s = new Queue();
    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println("current size: " + s.size());
    System.out.println(s.top());
    s.pop();
    System.out.println(s.top());
    s.pop();
    System.out.println(s.top());

    System.out.println("current size: " + s.size());
  }
}
