package com.java.hotelmanagemnt.HotelManagement.Configration;

import com.sun.source.tree.BreakTree;

public class LL {

    Node head;
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void addAt(String data,int idx){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(idx==0){
            addFirst(data);
        }else {
        Node currNode=head;
        for(int i=0;i<idx-1;i++){
            currNode=currNode.next;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
    }}
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }


    public void printList(){
        if(head==null){
            System.out.println("list is null");
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addAt("not",0);
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");

        list.printList();
    }
}
