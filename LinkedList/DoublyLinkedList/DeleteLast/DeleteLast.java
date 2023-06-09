public class DeleteLast {

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node deleteLast(Node head) {
    if (head == null || head.next == null) return null; else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.prev.next = null;
    }
    return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    head.next = temp1;
    temp1.next = temp2;
    temp1.prev = head;
    temp2.prev = temp1;
    traverse(head);
    traverse(deleteLast(head));
  }
}

class Node {

  int data;
  Node next, prev;

  Node(int x) {
    data = x;
  }
}
