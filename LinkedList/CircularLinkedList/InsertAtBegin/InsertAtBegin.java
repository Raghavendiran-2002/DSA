public class InsertAtBegin {

  static Node insertAtBegin(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) {
      newNode.next = newNode;
      return newNode;
    } else {
      newNode.next = head.next;
      head.next = newNode;
      int t = head.data;
      head.data = newNode.data;
      newNode.data = t;
      return head;
    }
  }

  static void traverse(Node head) {
    if (head == null) return;
    Node r = head;
    do {
      System.out.print(r.data + " ");
      r = r.next;
    } while (r != head);
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = head;
    traverse(head);
    insertAtBegin(head, 5);
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
