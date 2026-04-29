public class BinaryTreeString {

  NodeString root;

  public void add(String data) { // int jadi String
    if (root == null) {
      root = new NodeString(data);
      return;
    }
    root.add(data);
  }

  public void preTraverse(NodeString node) {
    if (node == null) return;
    System.out.printf("[%s]", node.data); //%d jadi %s
    preTraverse(node.left);
    preTraverse(node.right);
  }

  public void inTraverse(NodeString node) {
    if (node == null) return;
    inTraverse(node.left);
    System.out.printf("[%s]", node.data); //%d jadi %s
    inTraverse(node.right);
  }

  public void postTraverse(NodeString node) {
    if (node == null) return;
    postTraverse(node.left);
    postTraverse(node.right);
    System.out.printf("[%s]", node.data); //%d jadi %s
  }

  // Hitung jumlah daun
  public int countLeaves(NodeString node) {
    if (node == null) return 0;
    if (node.left == null && node.right == null) return 1;
    return countLeaves(node.left) + countLeaves(node.right);
  }

  // Hitung tinggi tree (berdasarkan jumlah node)
  public int height(NodeString node) {
    if (node == null) return 0;
    return 1 + Math.max(height(node.left), height(node.right));
  }

  public static void main(String[] args) {
    BinaryTreeString tree = new BinaryTreeString();

    // contoh data string
    String[] data = {"Jaehyun", "Taeyong", "Renjun", "Jeno", "Mark", "Hendery", "WinWin", "Vernon", "ByeonWooSeok", "Jun"};

    for (String nilai : data) {
      System.out.printf("Data %s dimasukkan.\n", nilai);
      tree.add(nilai);
    }

    System.out.println();

    System.out.print("Preorder: ");
    tree.preTraverse(tree.root);

    System.out.print("\nInorder: ");
    tree.inTraverse(tree.root);

    System.out.print("\nPostorder: ");
    tree.postTraverse(tree.root);

    System.out.println("\nJumlah daun: " + tree.countLeaves(tree.root));
    System.out.println("Tinggi tree: " + tree.height(tree.root));
  }
}