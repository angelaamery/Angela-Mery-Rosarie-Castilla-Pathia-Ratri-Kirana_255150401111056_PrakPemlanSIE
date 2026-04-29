package modul8

class NodeString {
  String data; // int jadi String
  NodeString left, right;

  NodeString(String data) {
    this.data = data;
  }

  public void add(String data) {
    // Operator < dan > diubah menjadi ".compareTo()"
    if (data.compareTo(this.data) > 0) {
      if (this.right == null) {
        this.right = new NodeString(data);
      } else {
        this.right.add(data);
      }
    } else if (data.compareTo(this.data) < 0) {
      if (this.left == null) {
        this.left = new NodeString(data);
      } else {
        this.left.add(data);
      }
    }
  }
}