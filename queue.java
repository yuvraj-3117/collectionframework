package framework;

import java.util.LinkedList;
import java.util.Queue;//FIFO

public class queue {

	public static void main(String[] args) {
		Queue <String> st = new LinkedList <> ();
		st.offer("loin");
		st.offer("cat");
		st.offer("dog");
		st.offer("donkey");
		st.offer("elephant");
		
		System.out.println(st);
		
		System.out.println(st.peek());
		
		st.poll();
		System.out.println(st.peek());

	
	
	}

}
