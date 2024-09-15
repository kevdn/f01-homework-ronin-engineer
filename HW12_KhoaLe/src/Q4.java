import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //queue using doubly linked list
        DoublyLinkedList queue = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int numRequests = scanner.nextInt();
        for (int i = 0; i < numRequests; i++) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println(queue.getSize());
                    break;
                case 2:
                    boolean isEmpty = queue.isEmpty();
                    if (isEmpty) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                case 3:
                    int data = scanner.nextInt();
                    queue.addLast(data);
                    break;
                case 4:
                    queue.removeFirst();
                    break;
                case 5:
                    int peek = queue.peek();
                    System.out.println(peek);
                    break;
                case 6:
                    int last = queue.getLast();
                    System.out.println(last);
                    break;
            }
        }
    }

}

class DoubleLNode {
    int data;
    DoubleLNode next;
    DoubleLNode prev;

    public DoubleLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DoubleLNode head;
    DoubleLNode tail;
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addLast(int data) {
        DoubleLNode newNode = new DoubleLNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return -1;
    }

    public int getLast() {
        if (!isEmpty()) {
            return tail.data;
        }
        return -1;
    }
}


