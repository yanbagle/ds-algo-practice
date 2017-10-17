
public class LLNode {
	public int data;
	public LLNode next;
	public LLNode prev;
	
	public LLNode(){
		data = -1;
		next = null;
		prev = null;
	}
	public LLNode(int val){
		this();
		data = val;
	}
	
	public String toString(){
		return "{" + data + "}" ;
	}
}
