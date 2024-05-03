package framework;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue //perform min or max 
{

	public static void main(String[] args) {
		Queue <Integer> st = new PriorityQueue<> ();
		st.offer(5);
		st.offer(3);
		st.offer(4);   // not follow order
		st.offer(5);//duplicate allow
		st.offer(11);
		st.offer(10);
		
		System.out.println(st);//1 2 3 4 5
		st.poll();//1 delete ho jyga
		System.out.println(st); // 2 3 4 5
		
		
		System.out.println(st.peek());//2
		
		
		
		
		
		
		//max value fisrt toh using comparator.reverse order
		
		Queue <Integer> st1 = new PriorityQueue<> (Comparator.reverseOrder());
		st1.offer(2);
		st1.offer(1);
		st1.offer(3);
		st1.offer(4);   // not follow order
		st1.offer(5);
		
		System.out.println(st1);// max value phele aygi output is 5 2 1 3 5
		
	}

}
