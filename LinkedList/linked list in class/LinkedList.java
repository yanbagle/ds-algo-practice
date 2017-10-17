import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class LinkedList {
	public LLNode head;
	public LLNode tail;

	public LinkedList() {
		head = new LLNode();  // create phantom
		tail = head;
	}
	
	public void addToHead(int val) {
		LLNode here = new LLNode(val);
		here.next = head;//phantom node
		here.prev = null;
		here.next.prev = here;
		head = here;
	}
	
	
	public void addToTail(int val) {
		LLNode here = new LLNode(val);
		here.next = tail;//tail is always phamton node
		here.prev = tail.prev;
		here.prev.next = here;//here.prev could be null
		tail.prev = here;
	}
	
	public void addInOrder(int val){
		LLNode here = head;
		while(here.data < val){
			here = here.next;
			if(here == null){
				break;
			}
		}
		/*
		while(here.next.next != null && here.data < val){
			here= here.next;
		}
		if(here.next.next = null){
			addToTail(val);
		}
		*/
		if(here == null){//if larger than all other values
			addToTail(val);
		}
		else if(here == head){//if smaller than all other values
			addToHead(val);
		}
		else{
			LLNode newGuy = new LLNode(val);
			newGuy.next = here;
			newGuy.prev = here.prev;
			here.prev.next = newGuy;
			here.prev = newGuy;
		}
	}
	public String toString() {
		String res = "[";
		LLNode here = head;
		int n = 1;
		while(here.next != null) {
			res += here;
			if(n++%10 == 0) {
				res += "\n      ";
			}
			here = here.next;
		}
		return res + "]";
	}

	public static PrintStream debug;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        try {
            debug = new PrintStream(new FileOutputStream("debug.log"));//new text file
        } catch (IOException e) {
            System.out.print("Error " + e + " opening debug.log");
        }
       debug.println("debug log opened");
		LinkedList it = new LinkedList();
		debug.println("Empty: " + it);
		it.addToHead(42);
		debug.println("Added 42 to head: " + it);
		it.addToTail(99);
		debug.println("Added 99 to tail: " + it);
		it.addToTail(150);
		debug.println("Added 150 to tail: " + it);
		it.addToTail(200);
		debug.println("Added 200 to tail: " + it);
		it.addInOrder(100);
		debug.println("Added 100 to tail" + it);
		it.addInOrder(30);
		debug.println("Added 30 to tail" + it);
		it.addInOrder(300);
		debug.println("Added 300 to tail" + it);
		it.addInOrder(220);
		debug.println("Added 220 to tail" + it);
	}

}
