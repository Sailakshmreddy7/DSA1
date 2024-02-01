public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // public static Node head;
    public static Node addFirst(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node addMiddle(int data, Node head) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                // slow = slow.next;
                fast = fast.next.next;
                slow = slow.next;
            }
            Node newNode = new Node(data);
            newNode.next = slow.next;
            slow.next = newNode;
        }
        return head;
    }

    public static Node addAtGivenPos(int data, int pos, Node head) {
        Node temp = head;
        if (head == null) {
            head = new Node(data);
        } else {

            int count = 1;
            while (count != pos - 1) {
                count = count + 1;
                temp = temp.next;
            }
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node addLast(int data, Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        return head;
    }

    public static Node deleteFirst(Node head) {
        head = head.next;
        return head;
    }

    public static Node deleteLast(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteMiddle(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            // slow = slow.next;
            fast = fast.next.next;
            slow = slow.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node deleteAtGivenPosition(Node head, int pos) {
        Node temp = head;
        int count = 1;
        while (count != pos - 1) {
            count = count + 1;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static boolean search(Node head, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        // printLL(head);
        // head = addFirst(50, head);
        // head = addFirst(60, head);
        // printLL(head);
        // head = addLast(70, head);
        // head = addMiddle(50, head);
        // printLL(head);
        // head = addAtGivenPos(100, 2, head);
        // head = deleteFirst(head);
        // head = deleteLast(head);
        // head = deleteMiddle(head);
        // head = deleteAtGivenPosition(head, 3);
        System.out.println(search(head, 30));
        // printLL(head);

    }
}
