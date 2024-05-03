package framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LearnArrayList {


	public static void main(String[] args ) {
		List lst = new LinkedList();//AARAYLIST OR LINKEDLIST SAME
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		System.out.println(lst);
		
		lst.add(0, 50);
		
		System.out.println(lst);
		
		//List <Integer> newlst = new ArrayList();
		//newlst.add(60);
		//newlst.add(70);
		//lst.addAll(newlst);
		//System.out.println(lst);
		
		
		System.out.println(lst.get(0));
		
		//lst.clear();
		//System.out.println(lst);
		
		lst.set(0, 200);
		System.out.println(lst);
		
	
		System.out.println (lst.contains(50));

		
		
	}
}
			
 
 	


