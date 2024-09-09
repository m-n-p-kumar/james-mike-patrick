package ds.singlyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private final int data;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void printSinglyLinkedList() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
            count++;
        }
        System.out.println("null");
        System.out.println("Number of nodes in linked list: " + count);
        System.out.println();
    }

    private void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void findLengthOfLinkedList() {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.println("Length of linked list: " + length);
    }

    private void insertNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    private void insertNodeAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void insertNodeAtPosition(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            int count = 0;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                ListNode temp = current.next;
                current.next = newNode;
                newNode.next = temp;
            }
        }
    }

    private void deleteFirstNode() {
        if (head != null) {
            head = head.next;
        }
    }

    private void deleteLastNode() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    private void deleteNodeAtEnd() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    private void deleteNodeAtPosition(int position) {
        if (head == null) {
            return;
        } else if (position == 0) {
            head = head.next;
            return;
        }
        ListNode current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    public void deleteNode(int pos) {
        System.out.println("pos: " + pos);
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        boolean isListLengthExceeded = false;
        ListNode previous = head;
        int count = 1;
        while (count < pos - 1) {
            previous = previous.next;
            count++;
            if (previous == null) {
                isListLengthExceeded = true;
                break;
            }
            if (count == pos) {
                break;
            }
        }
        if (isListLengthExceeded) {
            System.out.println("Invalid position");
            return;
        }
        ListNode current = previous.next;
        previous.next = current.next;
    }

    private void searchValueInLinkedList(int value) {
        int position = 0;
        ListNode current = head;
        while (current != null) {
            position++;
            if (current.data == value) {
                System.out.println("Given value (" + value + ") found at position " + position + " in LinkedList!");
                return;
            }
            current = current.next;
        }
        System.out.println("Given value (" + value + ") not found in LinkedList!");
    }

    private void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    private void findMiddleNodeOfLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node: " + slow.data);
    }

    private void findNodeFromEnd(int position) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while (count < position) {
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("Node at position (" + position + ") from END is " + slow.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        list.printSinglyLinkedList();

        list.insert(5);
        list.printSinglyLinkedList();

        list.findLengthOfLinkedList();

        list.insertNodeAtBeginning(0);
        list.printSinglyLinkedList();
        list.insertNodeAtBeginning(-1);
        list.printSinglyLinkedList();

        list.insertNodeAtEnd(6);
        list.printSinglyLinkedList();

        list.insertNodeAtPosition(7, 3);
        list.printSinglyLinkedList();

        list.deleteFirstNode();
        list.printSinglyLinkedList();

        list.deleteLastNode();
        list.printSinglyLinkedList();

        list.deleteNodeAtEnd();
        list.printSinglyLinkedList();

        list.deleteNodeAtPosition(2);
        list.printSinglyLinkedList();

        list.deleteNode(3);
        list.printSinglyLinkedList();

        list.deleteNode(7);
        list.printSinglyLinkedList();

        list.searchValueInLinkedList(3);
        list.searchValueInLinkedList(7);
        list.printSinglyLinkedList();

        list.reverseLinkedList();
        list.printSinglyLinkedList();

        list.findMiddleNodeOfLinkedList();
        list.printSinglyLinkedList();

        list.findNodeFromEnd(3);
        list.printSinglyLinkedList();

    }
}
