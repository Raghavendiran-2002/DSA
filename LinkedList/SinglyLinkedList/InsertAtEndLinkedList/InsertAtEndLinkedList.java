public class InsertAtEndLinkedList {

  static void traversalList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node insertAtEnd(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) return newNode;
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newNode;
    return head;
    // while (head.next != null) {
    //   head = head.next;
    // }
    // head.next = newNode;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    traversalList(head);
    insertAtEnd(head, 40);
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
