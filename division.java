import java.util.LinkedList;
import java.util.Stack;


public class division {
  public division(){
	  
  }
  public int perform(int div,int by){
	  Stack<Integer> stack=new Stack<Integer>();
	  int q=div;
	  while(q>=0){
		  stack.add(q);
		  q-=by;
		 
	  }
	  int a=0;
	  while(!stack.isEmpty()){
		  stack.pop();
		  a++;
	  }
	  return a;
  }
}
