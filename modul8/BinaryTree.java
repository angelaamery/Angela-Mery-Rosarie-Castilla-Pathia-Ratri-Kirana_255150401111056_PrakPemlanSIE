import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

  Node root;

  public void add(int data) {
    if (root == null) {
      root = new Node(data);
      return;
    }
    root.add(data);
  }

  public void preTraverse(Node node) {
    if (node == null) return;
    System.out.printf("[%d]", node.data);
    preTraverse(node.left);
    preTraverse(node.right);
  }

  public void inTraverse(Node node) {
    if (node == null) return;
    inTraverse(node.left);
    System.out.printf("[%d]", node.data);
    inTraverse(node.right);
  }

  public void postTraverse(Node node) {
    if (node == null) return;
    postTraverse(node.left);
    postTraverse(node.right);
    System.out.printf("[%d]", node.data);
  }

  // Method levelTraverse
  public void levelTraverse(Node node) {
  if (node == null) return;

  Queue<Node> queue = new LinkedList<>();
  queue.add(node);

  while (!queue.isEmpty()) {
    Node current = queue.poll();
    System.out.printf("[%d]", current.data);

    if (current.left != null) {
      queue.add(current.left);
    }
    if (current.right != null) {
      queue.add(current.right);
    }
  }
}

  // Method untuk menghitung jumlah node
  public int countNodes(Node node) {
    if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Method untuk menghitung jumlah daun
    public int countLeaves(Node node) {
        if (node == null) return 0;
            if (node.left == null && node.right == null) return 1;
                return countLeaves(node.left) + countLeaves(node.right);
    }

    // Method untuk mengukur tinggi
    public int height(Node node) {
        if (node == null) return 0;
            return 1 + Math.max(height(node.left), height(node.right));
    }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    int[] data = {52, 14, 62, 12, 40, 69, 39, 43, 33, 55};

    // INPUT DATA
    for (int nilai : data) {
      System.out.printf("Nilai %d dimasukkan.\n", nilai);
      tree.add(nilai);
    }
    System.out.println();

    System.out.print("Preorder Traversal: ");
    tree.preTraverse(tree.root);

    System.out.print("\nInorder Traversal: ");
    tree.inTraverse(tree.root);

    System.out.print("\nPostorder Traversal: ");
    tree.postTraverse(tree.root);

    System.out.print("\nLevel Order: ");
    tree.levelTraverse(tree.root);

    System.out.println("\nJumlah node: " + tree.countNodes(tree.root));

    System.out.println("Jumlah daun: " + tree.countLeaves(tree.root));

    System.out.println("Tinggi tree: " + tree.height(tree.root));
  }
}