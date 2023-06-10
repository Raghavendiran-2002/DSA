public class InsertAtEnd {

  static Node insertAtEnd(Node head, int data) {
    Node newNode = new Node(data);
    if (head == null) return newNode;
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newNode;
    newNode.prev = curr;
    return head;
  }

  static void traverseList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    head.next = temp1;
    temp1.next = temp2;
    temp1.prev = head;
    temp2.prev = temp1;
    traverseList(head);
    traverseList(insertAtEnd(head, 5));
  }
}

class Node {

  int data;
  Node next, prev;

  Node(int x) {
    data = x;
  }
}
