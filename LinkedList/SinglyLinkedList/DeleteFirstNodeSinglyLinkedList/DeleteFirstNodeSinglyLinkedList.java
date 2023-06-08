public class DeleteFirstNodeSinglyLinkedList {

  static void traveralList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node deleteFirstNode(Node head) {
    if (head == null) return null;
    return head.next;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    traveralList(head);
    traveralList(deleteFirstNode(head));
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
