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

    public static Node head;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        if (slow == null)
            return true;
        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast)
                return true;
        }
        return false;

    }

    public static Node removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow == fast) {
            slow = head;
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            // fast.next = null;

        }
        return head;

    }

    public static Node addTwoLinkedlists(Node l1, Node l2) {
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        Node head = new Node(-1);
        Node newHead = head;
        while (temp1 != null || temp2 != null) {
            int sum = 0;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            newHead.next = newNode;
            newHead = newNode;
        }
        Node newNode = new Node(carry);
        if (carry != 0) {
            newHead.next = newNode;
        }
        return head.next;

    }

    public static Node deleteKFromLast(Node head, int K) {
        Node fast = head;
        while (K != 0 && fast != null) {
            fast = fast.next;
            K--;
        }
        if (K != 0) {
            System.out.println("K is greater than the Length of the Node");
            return head;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        Node slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static Node reversingLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        // head.next.next.next.next.next.next = head.next.next;
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
        // System.out.println(search(head, 30));
        // printLL(head);
        // boolean a = isCycle();
        // System.out.println(a);
        // head = removeLoop(head);
        // printLL(head);
        // Node l1 = new Node(2);
        // l1.next = new Node(4);
        // l1.next.next = new Node(3);
        // l1.next.next.next = new Node(5);
        // printLL(l1);
        // Node l2 = new Node(5);
        // l2.next = new Node(6);
        // l2.next.next = new Node(4);
        // // l2.next.next.next = new Node(2);
        // printLL(l2);
        // head = addTwoLinkedlists(l1, l2);
        printLL(head);
        // int K = 1;
        // head = deleteKFromLast(head, K);
        // printLL(head);
        head = reversingLinkedList(head);
        printLL(head);

    }
}
