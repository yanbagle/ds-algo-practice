import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {

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



	public Node head, tail;
	private int size = 0;

	public LinkedList(){
        head = new Node();
        tail = new Node();
	}

	@Override
	public void add(T item) {
		if(item == null){
		    throw new NullPointerException();
        }
        addLast(item);
	}

	@Override
	public void clear() {
	    if(!isEmpty()){
	        for(int = 0; i < size; i++){
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
            if(currentNode.data.equal(item)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return(size == 0);

	}

	@Override
	public T remove(Object item) {
        if(item == null){
            throw new NullPointerException();
        }
        Node currentNode = head;
        for(int i = 0; i < size; i++) {
            if (item.equal(currentNode.data)) {
                return remove(currentNode);
            }
            currentNode = currentNode.next;
        }
	}

    @Override
    public T remove(int index) {
        if(index < 0){
            throw new NoSuchElementException();
        }
        Node removeNode;
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
        currentNode.next.prev = curentNode.prev;
        currentNode = null;
        return savedNode;
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
        return savedHead;
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
        return savedTail;
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return(size);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LLIterator<T>(this);

	}

	@Override
	public void add(T item, int index) {
        if(index == 0){
            addFirst(item);
        }
        else if(index == size){
            addLast(item);
        }

        Node newNode = new node(item);
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

	@Override
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

	@Override
	public int indexOf(Object item) {
        if(item == null){
            return new NullPointerException();
        }
        Node currentNode = headll;
        for(int i = 0; i < size; i++){
            if(currentNode.data.equal(item)){
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
        return tail.data;
	}

	/**
	 * Adds 'item' to front of this linked list
	 *
	 * @param item
	 */
	public void addFirst(T item) {
	    if(item == null) {
            throw new NullPointerException();
        }
        Node node = new Node(item);
        if(isEmpty()){
            head = node;
            tail = new Node();
            head.next = tail;
            tail.prev = head;
            size++;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = null;
            size++;
        }
	}

	/**
	 * Adds 'item' to the end of this linked list
	 *
	 * @param item
	 */
	public void addLast(T item) {
        if(item == null) {
            throw new NullPointerException();
        }
        Node node = new Node(item);
        if(isEmpty()){
            tail = node;
            tail.prev = head;
            head.next = tail;
            size++;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
            size++;
        }
	}

	public String toString(){

	}

	public Node reverse(Node head){
	    Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

	public static void main(String [] args){

	    LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		System.out.println(list.head);



	}//close main method



}
