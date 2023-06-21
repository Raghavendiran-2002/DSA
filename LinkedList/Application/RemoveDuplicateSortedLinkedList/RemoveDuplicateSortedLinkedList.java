public class RemoveDuplicateSortedLinkedList {

  static void removeDup(Node head) {
    Node curr = head;
    while (curr != null && curr.next != null) {
      if (curr.data == curr.next.data) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
  }

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
    head.next.next.next = new Node(30);
    head.next.next.next.next = new Node(50);
    traverse(head);
    removeDup(head);
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
