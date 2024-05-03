package framework;
import java.util.*;
public class ArrayDequeue {

	public static void main(String[] args) {
		
		ArrayDeque <Integer> q = new ArrayDeque<> ();
		
		q.offer(1);
		q.offerFirst(2);
		q.offer(3);
		q.offerLast(4);//order not maintian
		q.offer(5);
		
		System.out.println(q);//2 1 3 4 5
		System.out.println(q.peek());//2
		System.out.println(q);// 2 1 3 4 5

		
		q.poll();// 2 delete ho ke next element aa jayga
		System.out.println(q.peek());//2 
		System.out.println(q);//2 3 4 5
		System.out.println(q.peekFirst());//2
		System.out.println(q.peekLast());//5
		System.out.println(q);//2 3 4 5
		
	
		

		


	}

}
