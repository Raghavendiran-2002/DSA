public class PreorderTraversal {

  static void preorder(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(50);

    preorder(root);
  }
}

class Node {

  int data;
  Node left, right;

  Node(int k) {
    data = k;
    left = right = null;
  }
}
