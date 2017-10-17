package com.company;

public class Queue<T> {

    Node tail;
    Node head;
    int size;

    private class Node{

        Node next;
        T data;

        public Node(T data){
            this.data = data;
        }
        public Node(){
            data = null;
        }
    }

    public Queue(){
        tail = new Node();
        head = new Node();
        size = 0;
    }

    public Queue<T> enQueue(T data){

        if(data == null){
            return this;
        }
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return this;
    }

    public T deQueue(){
        if(head == null){
            return null;
        }
        T headData = head.data;
        head = head.next;
        size--;
        return headData;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = head;
        while (tmp != null) {
            sb.append(tmp.data).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}
