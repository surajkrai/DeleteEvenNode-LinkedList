package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedListNode six = new LinkedListNode(null, 6);
        LinkedListNode five = new LinkedListNode(six, 5);
        LinkedListNode four = new LinkedListNode(five, 4);
        LinkedListNode three = new LinkedListNode(four, 3);
        LinkedListNode two = new LinkedListNode(three, 2);
        LinkedListNode one = new LinkedListNode(two, 1);

        printLinkedList(one);

        LinkedListNode newList = deleteEven(one);
        printLinkedList(newList);

    }

    private static void printLinkedList(LinkedListNode one) {
        LinkedListNode head = one;
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;

        }
        System.out.println();
    }

    public static LinkedListNode deleteEven(LinkedListNode head) {

        LinkedListNode first = head;

        LinkedListNode current = null;
        LinkedListNode temp;
        LinkedListNode newHead = null;

        while (first != null) {

            if (!isEven(first)) {
                if (current == null) {
                    current = new LinkedListNode(null, first.data);
                    newHead = current;
                } else {
                    temp = new LinkedListNode(null, first.data);
                    current.next = temp;
                    current = temp;
                }
            }
            first = first.next;
        }

        return newHead;
    }

    public static boolean isEven(LinkedListNode node) {
        return node.data % 2 == 0 ? true : false;
    }

}