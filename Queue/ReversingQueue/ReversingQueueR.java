import java.util.ArrayDeque;

public class ReversingQueueR {

  static void reverseQueue(ArrayDeque<Integer> q) {
    if (q.size() == 0) {
      return;
    }
    int x = q.peek();
    q.remove();
    reverseQueue(q);
    q.add(x);
  }

  static void print(ArrayDeque<Integer> q) {
    while (q.size() != 0) {
      System.out.print(q.remove() + " ");
    }
  }

  public static void main(String[] args) {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(12);
    queue.add(5);
    queue.offer(15);
    queue.add(20);

    reverseQueue(queue);
    print(queue);
  }
}
