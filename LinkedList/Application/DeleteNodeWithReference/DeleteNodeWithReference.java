public class DeleteNodeWithReference {

  static void deleteNode(Node ptr) {
    Node temp = ptr.next;
    ptr.data = temp.data;
    ptr.next = temp.next;
  }

  static void printlist(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    Node ptr = new Node(30);
    head.next.next = ptr;
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(25);
    printlist(head);
    deleteNode(ptr);
    printlist(head);
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
