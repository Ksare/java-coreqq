package lr9;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ex12 {
    private Node head;
    private Node tail;
    private int size;

    public ex12() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // Циклические методы

    public void createHead() {
        System.out.print("Введите элементы списка (0 для завершения): ");
        head = null;
        tail = null;
        size = 0;

        while (true) {
            int data = readInter();
            if (data == 0) break;
            addFirst(data);
        }
    }

    private int readInter() {
        return 0;
    }

    public void createTail() {
        System.out.print("Введите элементы списка (0 для завершения): ");
        head = null;
        tail = null;
        size = 0;

        while (true) {
            int data = readInteger();
            if (data == 0) break;
            addLast(data);
        }
    }

    private int readInteger() {

        return 0;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        return result.length() > 0 ? result.substring(0, result.length() - 4) : "Список пуст";
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Неверный индекс");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Неверный индекс");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        if (current.next != null) {

        }
    }
}

















