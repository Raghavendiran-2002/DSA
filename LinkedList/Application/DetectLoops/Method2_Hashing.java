import java.util.HashSet;

public class Method2_Hashing {

  static boolean isLoop(Node head) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for (Node curr = head; curr != null; curr = curr.next) {
      if (hs.contains(curr.data)) return true;
      hs.add(curr.data);
    }
    return false;
  }

  public static void main(String[] args) {
    Node head = new Node(15);
    head.next = new Node(10);
    head.next.next = new Node(12);
    head.next.next.next = new Node(20);
    head.next.next.next.next = head.next;
    if (isLoop(head)) System.out.print("Loop found"); else System.out.print(
      "No Loop"
    );
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
