package SingleLinkedListProject;

public class SingleLinkedList {

  // NODE 
  static class Node {
    Object data;
    Node next;

    Node(Object data) {
      this.data = data;
    }
  }

  Node head, tail;
  int size = 0;

  boolean isEmpty() {
    return size == 0;
  }

  void addFirst(Node data) {
    if (isEmpty()) {
      head = data;
      tail = data;
    } else {
      data.next = head;
      head = data;
    }
    size++;
  }

  void addLast(Node data) {
    if (isEmpty()) {
      head = data;
      tail = data;
    } else {
      tail.next = data;
      tail = data;
    }
    size++;
  }

  // A
  Node find(Object value) {
    Node temp = head;
    while (temp != null) {
      if (temp.data.equals(value)) return temp;
      temp = temp.next;
    }
    return null;
  }

  // B
  Node get(int index) {
    if (index < 0 || index >= size) return null;

    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (i == index) return temp;
      temp = temp.next;
      i++;
    }
    return null;
  }

  // C
  void remove(int index) {
    if (index < 0 || index >= size) return;

    if (index == 0) {
      head = head.next;
      if (head == null) tail = null;
    } else {
      Node prev = head;
      for (int i = 0; i < index - 1; i++) {
        prev = prev.next;
      }

      Node target = prev.next;
      prev.next = target.next;

      if (target == tail) {
        tail = prev;
      }
    }
    size--;
  }

  // D
  void removeByValue(Object value) {
    if (isEmpty()) return;

    if (head.data.equals(value)) {
      head = head.next;
      if (head == null) tail = null;
      size--;
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      if (temp.next.data.equals(value)) {
        if (temp.next == tail) {
          tail = temp;
        }
        temp.next = temp.next.next;
        size--;
        return;
      }
      temp = temp.next;
    }
  }

  // E
  void addAt(int index, Node data) {
    if (index < 0 || index > size) return;

    if (index == 0) {
      addFirst(data);
    } else if (index == size) {
      addLast(data);
    } else {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }

      data.next = temp.next;
      temp.next = data;
      size++;
    }
  }

  // F
  void addAfter(Object key, Node data) {
    Node temp = head;

    while (temp != null) {
      if (temp.data.equals(key)) {
        data.next = temp.next;
        temp.next = data;

        if (temp == tail) {
          tail = data;
        }
        size++;
        return;
      }
      temp = temp.next;
    }
  }

  // G
  void addBefore(Object key, Node data) {
    if (isEmpty()) return;

    if (head.data.equals(key)) {
      addFirst(data);
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      if (temp.next.data.equals(key)) {
        data.next = temp.next;
        temp.next = data;
        size++;
        return;
      }
      temp = temp.next;
    }
  }

  void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  // ===== MAIN =====
  public static void main(String[] args) {

    // A
    SingleLinkedList listA = new SingleLinkedList();
    listA.addFirst(new Node("A"));
    listA.addLast(new Node("B"));
    listA.addLast(new Node("C"));

    Node a1 = listA.find("B");
    if (a1 != null) {
      System.out.println("Data ditemukan: " + a1.data);
    } else {
      System.out.println("Data tidak ditemukan");
    }

    Node a2 = listA.find("Z");
    if (a2 != null) {
      System.out.println("Data ditemukan");
    } else {
      System.out.println("Data tidak ditemukan");
    }

    // B
    SingleLinkedList listB = new SingleLinkedList();
    listB.addFirst(new Node("A"));
    listB.addLast(new Node("B"));
    listB.addLast(new Node("C"));

    Node b1 = listB.get(1);
    if (b1 != null) {
      System.out.println("\nData pada index 1 ditemukan: " + b1.data);
    } else {
      System.out.println("Data tidak ditemukan");
    }

    Node b2 = listB.get(5);
    if (b2 != null) {
      System.out.println("Data ditemukan");
    } else {
      System.out.println("Data pada index 5 tidak ditemukan");
    }

    // C
    SingleLinkedList listC = new SingleLinkedList();
    listC.addFirst(new Node("A"));
    listC.addLast(new Node("B"));
    listC.addLast(new Node("C"));

    System.out.print("\nData awal: ");
    listC.printList();

    listC.remove(1);

    System.out.print("Setelah dihapus: ");
    listC.printList();

    // D
    SingleLinkedList listD = new SingleLinkedList();
    listD.addFirst(new Node("A"));
    listD.addLast(new Node("B"));
    listD.addLast(new Node("C"));

    System.out.print("\nData awal: ");
    listD.printList();

    listD.removeByValue("B");

    System.out.print("Setelah dihapus: ");
    listD.printList();

    // E
    SingleLinkedList listE = new SingleLinkedList();
    listE.addFirst(new Node("A"));
    listE.addLast(new Node("B"));
    listE.addLast(new Node("C"));

    System.out.print("\nData awal: ");
    listE.printList();

    listE.addAt(1, new Node("X"));

    System.out.print("Setelah ditambah: ");
    listE.printList();

    // F
    SingleLinkedList listF = new SingleLinkedList();
    listF.addFirst(new Node("A"));
    listF.addLast(new Node("B"));
    listF.addLast(new Node("C"));

    System.out.print("\nData awal: ");
    listF.printList();

    listF.addAfter("B", new Node("Y"));

    System.out.print("Setelah ditambah: ");
    listF.printList();

    // G
    SingleLinkedList listG = new SingleLinkedList();
    listG.addFirst(new Node("A"));
    listG.addLast(new Node("B"));
    listG.addLast(new Node("C"));

    System.out.print("\nData awal: ");
    listG.printList();

    listG.addBefore("B", new Node("Z"));

    System.out.print("Setelah ditambah: ");
    listG.printList();
  }
}