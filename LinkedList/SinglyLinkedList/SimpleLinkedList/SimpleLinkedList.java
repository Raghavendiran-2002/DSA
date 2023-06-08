public class SimpleLinkedList {

  public static void main(String[] args) {
    Node head1 = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    head1.next = temp1;
    temp1.next = temp2;
    // OR
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
  }
}

class Node {

  Node next;
  int data;

  Node(int x) {
    data = x;
    next = null;
  }
}
