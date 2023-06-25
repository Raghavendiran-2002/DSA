import java.util.ArrayDeque;
import java.util.LinkedList;

public class ReversingQueueI {

  static ArrayDeque<Integer> queue;

  static void reverseQueue(ArrayDeque<Integer> q) {
    ArrayDeque<Integer> s = new ArrayDeque<>();
    while (q.isEmpty() == false) {
      s.push(q.remove());
    }
    while (s.isEmpty() == false) {
      q.add(s.pop());
    }
  }

  static void Print() {
    for (Integer x : queue) System.out.print(x + " ");
  }

  public static void main(String[] args) {
    queue = new ArrayDeque<Integer>();
    queue.add(12);
    queue.add(5);
    queue.add(15);
    queue.add(20);

    reverseQueue(queue);
    Print();
  }
}
