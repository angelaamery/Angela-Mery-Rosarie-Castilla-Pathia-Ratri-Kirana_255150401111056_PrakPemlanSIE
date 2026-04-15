package DoubleLinkedListProject;

public class DoubleLinkedList {

    // Node
    static class Node {
        Object data;
        Node prev, next;

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
            head.prev = data;
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
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // A
    Node find(Object value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // B
    Node get(int index) {
        if (index < 0 || index >= size) return null;

        Node current = head;
        int i = 0;
        while (current != null) {
            if (i == index) return current;
            current = current.next;
            i++;
        }
        return null;
    }

    // C
    void remove(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            if (current == tail) {
                tail = current.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    // D
    void removeByValue(Object value) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(value)) {

                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                return;
            }
            current = current.next;
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
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            data.next = current.next;
            data.prev = current;

            current.next.prev = data;
            current.next = data;

            size++;
        }
    }

    // F
    void addAfter(Object key, Node data) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(key)) {

                data.next = current.next;
                data.prev = current;

                if (current.next != null) {
                    current.next.prev = data;
                } else {
                    tail = data;
                }

                current.next = data;
                size++;
                return;
            }
            current = current.next;
        }
    }

    // G
    void addBefore(Object key, Node data) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(key)) {

                data.next = current;
                data.prev = current.prev;

                if (current.prev != null) {
                    current.prev.next = data;
                } else {
                    head = data;
                }

                current.prev = data;
                size++;
                return;
            }
            current = current.next;
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        // A
        DoubleLinkedList listA = new DoubleLinkedList();
        listA.addLast(new Node("A"));
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

        System.out.println();

        // B
        DoubleLinkedList listB = new DoubleLinkedList();
        listB.addLast(new Node("A"));
        listB.addLast(new Node("B"));
        listB.addLast(new Node("C"));

        Node b1 = listB.get(1);
        if (b1 != null) {
            System.out.println("Data pada index 1 ditemukan: " + b1.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        Node b2 = listB.get(5);
        if (b2 != null) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data pada index 5 tidak ditemukan");
        }

        System.out.println();

        // C
        DoubleLinkedList listC = new DoubleLinkedList();
        listC.addLast(new Node("A"));
        listC.addLast(new Node("B"));
        listC.addLast(new Node("C"));

        System.out.print("Data awal: ");
        listC.printList();

        listC.remove(1);

        System.out.print("Setelah dihapus: ");
        listC.printList();

        System.out.println();

        // D
        DoubleLinkedList listD = new DoubleLinkedList();
        listD.addLast(new Node("A"));
        listD.addLast(new Node("B"));
        listD.addLast(new Node("C"));

        System.out.print("Data awal: ");
        listD.printList();

        listD.removeByValue("B");

        System.out.print("Setelah dihapus: ");
        listD.printList();

        System.out.println();

        // E
        DoubleLinkedList listE = new DoubleLinkedList();
        listE.addLast(new Node("A"));
        listE.addLast(new Node("B"));
        listE.addLast(new Node("C"));

        System.out.print("Data awal: ");
        listE.printList();

        listE.addAt(1, new Node("X"));

        System.out.print("Setelah ditambah: ");
        listE.printList();

        System.out.println();

        // F
        DoubleLinkedList listF = new DoubleLinkedList();
        listF.addLast(new Node("A"));
        listF.addLast(new Node("B"));
        listF.addLast(new Node("C"));

        System.out.print("Data awal: ");
        listF.printList();

        listF.addAfter("B", new Node("Y"));

        System.out.print("Setelah ditambah: ");
        listF.printList();

        System.out.println();

        // G
        DoubleLinkedList listG = new DoubleLinkedList();
        listG.addLast(new Node("A"));
        listG.addLast(new Node("B"));
        listG.addLast(new Node("C"));

        System.out.print("Data awal: ");
        listG.printList();

        listG.addBefore("B", new Node("Z"));

        System.out.print("Setelah ditambah: ");
        listG.printList();
    }
}
