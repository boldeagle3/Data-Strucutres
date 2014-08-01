import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Graph {
	private Vector<Node> nodes;
	private int num=0;
	public Graph(){
		
	}
	public void addNode(Node a){
		a.setNum(num);
		nodes.add(a);
		num++;
	}
	public Vector<Integer> bfs(Node a){
		Vector<Integer> distance = new Vector<Integer>();
		int point;
		for(int i=0;i<nodes.size();i++){
			distance.add(-1);
			if(a==nodes.get(i)){
				distance.set(i, 0);
				point=i;
			}
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(a);
		int d=1;
		int currentsize=1;
		Queue<Node> nextQ= new LinkedList<Node>();
		while(!q.isEmpty()){
			Node no=q.remove();
			distance.set(no.getNum(), d);
			
			for(int i=0;i<no.neighbors().size();i++){
				if(distance.get(no.neighbors().get(i).getNum())==-1){
					nextQ.add(no.neighbors().get(i));
					distance.set(no.neighbors().get(i).getNum(),d);
				}
			}
			if(q.isEmpty()){
				d++;
				q=nextQ;
			}
		}
		return distance;
		
	}
}
