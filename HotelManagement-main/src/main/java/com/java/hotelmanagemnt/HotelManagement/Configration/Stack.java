package com.java.hotelmanagemnt.HotelManagement.Configration;

public class Stack {

    int stack[] = new int[3];
    int top = 0;
    public void push(int data) {
    int top = 0;
    if(size()==3){
        System.out.println("stack is full");
    }else {
        stack[top] = data;
        top++;
     }
    }
    public int size(){
        return top;
    }
    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("stack is empty");
        }else {
            top--;
            data=stack[top];
            stack[top]=0;
        }
        return data;
    }
    public int peek(){
        int data;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public boolean isEmpty(){
        return top<=0;
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());

        }
    }
}