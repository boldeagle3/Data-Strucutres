import java.util.LinkedList;
import java.util.Queue;
public class priorityQueue {
	Queue<Integer> low=new LinkedList<Integer>();
	Queue<Integer> high=new LinkedList<Integer>();
	public priorityQueue(){
		
	}
	public void enqueue(int pri,int val){
		if(pri==0){
			low.add(val);
		}
		else
			high.add(val);
	}
	public int dequeue(){
		if(high.isEmpty()&&!low.isEmpty())
			return low.remove();
		else
			return high.remove();
	}
}
