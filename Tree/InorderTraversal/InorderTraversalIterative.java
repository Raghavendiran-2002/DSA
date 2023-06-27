import java.util.ArrayDeque;

public class InorderTraversalIterative {

  static void inorder(Node root) {
    ArrayDeque<Node> s = new ArrayDeque<>();
    Node curr = root;
    while (curr != null || s.isEmpty() == false) {
      while (curr != null) {
        s.add(curr);
        curr = curr.left;
      }
      curr = s.pop();
      System.out.print(curr.data + " ");
      curr = curr.right;
    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.right = new Node(50);

    inorder(root);
  }
}

class Node {

  int data;
  Node left;
  Node right;

  Node(int k) {
    data = k;
    left = right = null;
  }
}
