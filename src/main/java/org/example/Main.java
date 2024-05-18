package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of items: ");
        int n = scanner.nextInt();

        LinkedListNode one = null;
        LinkedListNode head = null;
        LinkedListNode temp = null;
        for(int i=0;i<n;i++){
            System.out.println("Enter Number: ");
            temp= new LinkedListNode(null, scanner.nextInt());
            if(head==null){
                one=temp;
                head=one;
            }else{
                one.next=temp;
                one=temp;
            }
        }

        printLinkedList(head);

        LinkedListNode newList = deleteEven(head);
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
        return node.data % 2 == 0;
    }

}