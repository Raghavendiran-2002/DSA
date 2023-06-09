public class ReverseList {

  static void traverseList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node reverseLists(Node head) {
    if (head == null || head.next == null) return head;
    Node prev = null, curr = head;
    while (curr != null) {
      prev = curr.prev;
      curr.prev = curr.next;
      curr.next = prev;
      curr = curr.prev;
    }
    return prev.prev;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    Node temp3 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp1.prev = head;
    temp2.prev = temp1;
    temp3.prev = temp2;
    temp2.next = temp3;
    traverseList(head);
    traverseList(reverseLists(head));
  }
}

class Node {

  int data;
  Node next, prev;

  Node(int x) {
    data = x;
  }
}
