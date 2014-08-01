
public class MyStack {
	private StackNode pointer;
	private int count=0;
	public MyStack(){

	}
	public void push(StackNode p){
		count++;
		if(pointer==null){
			pointer=p; 
		}
		else{
			pointer.setNext(p);
			pointer=pointer.getNext();
		}
	
	}
	public StackNode pop(){
		if(pointer==null){
			return null;
		}
		count--;
		StackNode stacker;
		stacker=pointer.getPrev();
		stacker.setNext(null);
		StackNode s=pointer;
		pointer=stacker;
		return s;
	}
	public boolean isEmpty(){
		if(count==0){
			return true;
		}
		return false;
	}
	public int amount(){
		return count;
	}
	public StackNode top(){
		return pointer;
	}
}
