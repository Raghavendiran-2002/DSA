public class CircularLinkedList {

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = head;
    traverse(head);
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
