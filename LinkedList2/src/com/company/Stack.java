package com.company;

public class Stack<T> {

    private int size;

    private Node head;

    private class Node {
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
        }
        public Node(){
            this.data = null;
        }
    }

    public Stack() {
        size = 0;
        head = new Node();
    }

    public Stack<T> push(T data)
    {
        if(data == null){
            return this;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        return this;
    }

    public T pop()
    {
        if(head == null){
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
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
