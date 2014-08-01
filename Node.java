import java.util.Vector;


public class Node {
	private Vector<Node> connection;
    private int num;
	public Node(){
		
	}
	public void insertNeighbor(Node a){
		connection.add(a);
	}
	public boolean nextTo(Node a){
		for(int i=0;i<connection.size();i++){
			if(connection.get(i)==a)
				return true;
			
		}
		return false;
	}
	public int getNum(){
		return num;
	}
	public void setNum(int i){
		num=i;
	}
	public Vector<Node> neighbors(){
		return connection;
	}
}
