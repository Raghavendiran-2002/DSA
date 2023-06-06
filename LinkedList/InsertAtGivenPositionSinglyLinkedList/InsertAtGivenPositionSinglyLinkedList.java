public class InsertAtGivenPositionSinglyLinkedList {

  static void traverseList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  static Node insertGivenPost(Node head, int x, int pos) {
    Node temp = new Node(x);
    if (pos == 1) {
      temp.next = head;
      return temp;
    }
    Node curr = head;
    int count = 0;
    while (curr.next != null && pos < count) {
      curr = curr.next;
      count++;
    }
    temp.next = curr.next;
    curr.next = temp;
    return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(30);
    head.next.next = new Node(50);
    head.next.next.next = new Node(70);
    traverseList(head);
    insertGivenPost(head, 20, 2);
    System.out.println();
    traverseList(head);
    System.out.println();
    insertGivenPost(head, 25, 3);
    traverseList(head);
    System.out.println();
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
