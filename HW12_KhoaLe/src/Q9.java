public class Q9 {
    public static void main(String[] args) {
        //implement single linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        third.next = null;

        //print linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }

    }
}

//implement single linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }


}

