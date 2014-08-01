
public class MyQueue {
	private StackNode first;
	private StackNode last;
	private int count=0;
    public MyQueue(){
    }
    public void enqueue(StackNode q){
    	count++;
    	if(first==null){
    		first=q;
    		last=q;
    	}
    	else{
    		StackNode temp=first;
    		first=q;
    		q.setNext(temp);
    	}
    }
    public StackNode dequeue(){
    	if(last==null){
    		return null;
    	}
    	count--;
    	StackNode re=last;
    	StackNode temp=last.getPrev();
    	last=temp;
    	return re;	
    }
    public boolean isEmpty(){
    	if(count==0)
    		return true;
    	return false;
    }
    public int amount(){
    	return count;
    }
    public StackNode front(){
    	return last;
    }
}
