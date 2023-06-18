public class InsertAtBegin {

  static void traverse(Node head) {
    Node temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);
    System.out.println();
  }

  static Node insertAtBegin(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) {
      newNode.next = newNode;
      newNode.prev = newNode;
      return newNode;
    } else {
      newNode.prev = head.prev;
      newNode.next = head;
      head.prev.next = newNode;
      head.prev = newNode;
      return newNode;
    }
    // return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node h2 = new Node(20);
    Node h3 = new Node(30);
    head.next = h2;
    h2.next = h3;
    h3.next = head;
    head.prev = h3;
    h3.prev = h2;
    h2.prev = head;
    traverse(head);
    head = insertAtBegin(head, 5);
    traverse(head);
    head = insertAtBegin(head, 2);
    traverse(head);
  }
}

class Node {

  int data;
  Node prev, next;

  Node(int x) {
    data = x;
    prev = next = null;
  }
}
