package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> {

    public class LLIterator<T> implements Iterator<T>{

        private LinkedList<T> list;
        private int position;
        private boolean removable;

        public LLIterator(LinkedList<T> list){
            position = -1;
            removable = false;
            this.list = list;
        }

        public void remove(){
            if(removable != true){
                throw new NoSuchElementException();
            }
            list.remove(position);
            position--;
            removable = false;
        }

        public boolean hasNext(){
            if((position+1) == (list.size)){
                return false;
            }
            return true;
        }

        public boolean hasPrev(){
            return true;
        }

        //get methods
        public T next(){
            if(hasNext() == false){
                throw new NoSuchElementException();
            }
            position++;
            removable = true;
            return list.get(position);
        }
        public T prev(){
            if(hasPrev() == false){
                throw new NoSuchElementException();
            }
            position--;
            removable = true;
            return list.get(position);
        }

    }


    //private Node class
    private class Node {
        Node next, prev;
        T data;

        public Node(){
            next = null;
            prev = null;
            data = null;
        }
        public Node(T thing){
            this();
            data = thing;
        }
    }//close private Node class



    private Node head, tail;
    private int size = 0;

    public LinkedList(){
        head = new Node();
        tail = new Node();
    }

    public void add(T item) {
        if(item == null){
            throw new NullPointerException();
        }
        if(isEmpty()){
            Node currentNode = new Node(item);
            head = currentNode;
            head.prev = null;
            tail.prev = head;
            head.next = tail;
            size++;
        }
        else{
            addLast(item);
        }
    }

    /**
     * Adds 'item' to front of this linked list
     *
     * @param item
     */
    public void addFirst(T item) {
        Node node = new Node(item);
        node.next = head;
        head.prev = node;
        head = node;
        head.prev = null;
        size++;
    }

    /**
     * Adds 'item' to the end of this linked list
     *
     * @param item
     */
    public void addLast(T item) {
        Node node = new Node(item);
        node.prev = tail.prev;
        tail.prev.next = node;
        node.next = tail;
        tail.prev = node;
        size++;
    }

    public void clear() {
        if(!isEmpty()){
            for(int i = 0; i < size; i++){
                Node current = head;
                head = head.next;
                head.prev = null;
                current = null;
            }
        }
    }
    public boolean contains(Object item) {
        if(isEmpty()){
            return false;
        }
        Node currentNode = head;
        for(int i = 0; i < size; i++){
            if(currentNode.data != null && item != null && currentNode.data.equals(item)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

   
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return(size == 0);

    }

   
    public T remove(Object item) {
        Node currentNode = head;
        for(int i = 0; i < size; i++) {
            if (item != null && currentNode.data != null && item.equals(currentNode.data)) {
                if(i == 0){
                    removeFirst();
                }
                else{
                    return remove(currentNode);
                }
            }
            currentNode = currentNode.next;
        }
        return null;
    }

   
    public T remove(int index) {
        if(index < 0 || index >= size){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        else if(index == size-1){
            return removeLast();
        }
        else{
            int count = 0;
            Node currentNode = head;
            while(count != index){
                currentNode = currentNode.next;
                count++;
            }
            return remove(currentNode);
        }
    }

    public T remove(Node currentNode){
        Node savedNode = currentNode;
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        //currentNode = null;
        size--;
        return savedNode.data;
    }

    /**
     * Removes and returns the first item from this linked list
     *
     * @return
     * @throws NoSuchElementException
     *             if this linked list is empty
     */
    public T removeFirst() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node savedHead = head;
        head = head.next;
        head.prev = null;
        size--;
        return savedHead.data;
    }

    /**
     * Removes and returns the last item from this linked list
     *
     * @return
     * @throws NoSuchElementException
     *             if this linked list is empty
     */
    public T removeLast() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node savedTail = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return savedTail.data;
    }

   
    public int size() {
        // TODO Auto-generated method stub
        return(size);
    }

   
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new LLIterator<T>(this);

    }

   
    public void add(T item, int index) {
        if(index == 0){
            addFirst(item);
        }
        else if(index == size){
            addLast(item);
        }

        Node newNode = new Node(item);
        Node currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        currentNode.prev.next = newNode;
        newNode.prev = currentNode.prev;
        newNode.next = currentNode;
        currentNode.prev = newNode;
        size++;
    }

   
    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            return head.data;
        }else if(index == (size - 1)){
            return tail.data;
        }
        Node currentNode = head;
        for(int i = 0 ; i < index; i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

   
    public int indexOf(Object item) {
        if(item == null){
            return -1;
        }
        Node currentNode = head;
        for(int i = 0; i < size; i++){
            if(currentNode.data.equals(item)){
                return i;
            }
        }
        return -1;
    }

    /**
     * @return the first item in this linked list
     * @throws NoSuchElementException
     *             if this linked list is empty
     */
    public T getFirst() {
        // TODO method stub
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    /**
     * @return the last item in this linked list
     * @throws NoSuchElementException
     *             if this linked list is empty
     */
    public T getLast() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return tail.prev.data;
    }

    public String toString(){
        String str = "";
        Node currentNode = this.head;

        for(int i = 0; i < this.size; ++i) {
            str = str + currentNode.data + " ";
            currentNode = currentNode.next;
        }

        return str;
    }



}

