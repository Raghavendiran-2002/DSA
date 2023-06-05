public class DeleteLastNodeSinglyLinkedList {

  static void traverseList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static void deleteLastNode(Node head) {
    if (head == null) return;
    if (head.next == null) return;
    Node curr = head;
    while (curr.next.next != null) {
      curr = curr.next;
    }
    curr.next = null;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    traverseList(head);
    deleteLastNode(head);
    traverseList(head);
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
