public class Q10 {
    public static void main(String[] args) {
        DLNode head = new DLNode(1);
        DLNode node2 = new DLNode(2);
        DLNode node3 = new DLNode(3);

        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;

        DLNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" - ");
            }
            current = current.next;
        }


    }
}

//implement double linked list
class DLNode {
    int data;
    DLNode next;
    DLNode prev;

    public DLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DLNode(int data, DLNode next, DLNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
