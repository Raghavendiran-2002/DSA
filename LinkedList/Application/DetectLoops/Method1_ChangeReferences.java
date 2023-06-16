public class Method1_ChangeReferences {

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static boolean isLoop(Node head) {
    Node temp = new Node(0);
    Node curr = head;
    while (curr != null) {
      if (curr.next == null) return false;
      if (curr.next == temp) return true;
      Node curr_next = curr.next;
      curr.next = temp;
      curr = curr_next;
    }
    return false;
  }

  public static void main(String[] args) {
    Node head = new Node(15);
    head.next = new Node(10);
    head.next.next = new Node(12);
    head.next.next.next = new Node(20);
    head.next.next.next.next = head.next;
    if (isLoop(head)) System.out.print("Loop found"); else System.out.print(
      "No Loop"
    );
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
