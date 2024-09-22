package com.java.hotelmanagemnt.HotelManagement.Configration;

public class NewStack {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node findMid(Node head) {
        Node hare = head;
        Node turtule = head;
        if (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtule = turtule.next;
        }
        return turtule;
    }

    public Node reverse(Node head) {
        Node prev=null;
        Node curr=head;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public boolean palindrom(Node head) {
        if (head.next == null || head.next.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node secondHalfFirst = reverse(mid.next);
        Node firstHalffirst = head;
        while (secondHalfFirst != null) {
            if (firstHalffirst.data != secondHalfFirst.data) {
                return false;
            }
                firstHalffirst = firstHalffirst.next;
                secondHalfFirst = secondHalfFirst.next;
            }
        return true;
    }
}
