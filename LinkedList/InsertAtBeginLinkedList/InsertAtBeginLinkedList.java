public class InsertAtBeginLinkedList {

  static void traversalList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  static Node insertAtBegin(Node head, int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    return newNode;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    traversalList(head);
    System.out.println();
    head = insertAtBegin(head, 5);
    traversalList(head);
    System.out.println();
    traversalList(insertAtBegin(null, 10));
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
