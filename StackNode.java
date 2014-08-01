
public class StackNode {
	private StackNode prev;
	private StackNode next;
	public StackNode(){
	}
	public StackNode getPrev() {
		return prev;
	}
	public void setPrev(StackNode prev) {
		this.prev = prev;
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	}
}
