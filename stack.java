package framework;//follow last in first out

import java.util.Stack;//push,pope,peak  

public class stack {

	public static void main(String[] args) {
		Stack <String> st = new Stack <> ();
		st.push("loin");
		st.push("cat");
		st.push("dog");
		st.push("donkey");
		st.push("elephant");
		
		System.out.println(st);
		
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.peek());

	

	}

}
