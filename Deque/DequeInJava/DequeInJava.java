import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeInJava {

  static void DequeWithException() {
    ArrayDeque<Integer> d = new ArrayDeque<>();
    d.addFirst(10);
    d.addLast(20);
    d.addFirst(5);
    d.addLast(15);
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
    d.removeFirst();
    d.removeLast();
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
  }

  public static void main(String[] args) {
    ArrayDeque<Integer> d = new ArrayDeque<>();
    d.offerFirst(10);
    d.offerLast(20);
    d.offerFirst(5);
    d.offerLast(15);
    System.out.println(d.peekFirst());
    System.out.println(d.peekLast());
    d.pollFirst();
    d.pollLast();
    System.out.println(d.peekFirst());
    System.out.println(d.peekLast());

    Iterator it = d.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();
    for (int x : d) {
      System.out.print(x + " ");
    }
    System.out.println();

    Iterator io = d.descendingIterator();
    while (io.hasNext()) {
      System.out.print(io.next() + " ");
    }
    System.out.println();
  }
}
