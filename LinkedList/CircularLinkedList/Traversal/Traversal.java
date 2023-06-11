public class Traversal {

  static void traversesFor(Node head) {
    if (head == null) return;
    System.out.print(head.data + " ");
    for (Node r = head.next; r != head; r = r.next) System.out.print(
      r.data + " "
    );
  }

  static void traversesWhile(Node head) {
    if (head == null) return;
    Node r = head;
    do {
      System.out.print(r.data + " ");
      r = r.next;
    } while (r != head);
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = head;
    // traversesFor(head);
    traversesWhile(head);
  }
}

class Node {

  int data;
  Node next, prev;

  Node(int x) {
    data = x;
  }
}
