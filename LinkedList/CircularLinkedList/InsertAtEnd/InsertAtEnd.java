public class InsertAtEnd {

  static Node insertAtEnd(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) {
      newNode.next = newNode;
      return newNode;
    } else {
      newNode.next = head.next;
      head.next = newNode;
      int t = newNode.data;
      newNode.data = head.data;
      head.data = t;
      return newNode;
    }
  }

  static void traverse(Node head) {
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
    traverse(head);
    // insertAtEnd(head, 5);
    System.out.println();
    traverse(insertAtEnd(head, 5));
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
