public class DeleteKth {

  static void traverse(Node head) {
    Node temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);
    System.out.println();
  }

  static Node deleteKth(Node head, int k) {
    if (k == 1 && head != null) {
      return null;
    }
    Node curr = head;
    for (int i = 0; i < k - 2; i++) {
      curr = curr.next;
    }
    curr.next = curr.next.next;
    return head;
    // int count = 1;
    // while (k == count && head != null) {
    //   head = head.next;
    //   count++;
    // }
    // head = head.next;
    // return head;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = head;
    traverse(head);
    // insertAtEnd(head, 5);
    System.out.println();
    traverse(deleteKth(head, 2));
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
