public class SortedInsertSinglyLinkedList {

  static Node insertSorted(Node head, int x) {
    Node newnode = new Node(x);
    Node temp = head, prev = null;
    if (head == null) return newnode;
    if (x < head.data) {
      newnode.next = head;
      return newnode;
    }

    while (temp.next != null && temp.next.data < x) {
      temp = temp.next;
    }
    newnode.next = temp.next;
    temp.next = newnode;
    return head;
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
    head.next.next.next = new Node(40);
    traverse(head);
    insertSorted(head, 25);
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
