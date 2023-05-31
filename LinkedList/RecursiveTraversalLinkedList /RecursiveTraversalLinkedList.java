public class RecursiveTraversalLinkedList {

  static void traversalList(Node head) {
    if (head == null) return;
    System.out.print(head.data + " ");
    traversalList(head.next);
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    traversalList(head);
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}
