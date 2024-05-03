package framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset//folow order
{

	public static void main(String[] args)
	{
		Set <Integer> st = new LinkedHashSet<>  ();

		st.add(13);
		st.add(13);
		st.add(23);
		st.add(33);
		st.add(42);
		st.add(52);
		
		System.out.println(st);
		
		st.remove(23);
		System.out.println(st);
		
		
		System.out.println(st.contains(33));//true or false 
		
		
		System.out.println(st.isEmpty());//true or false
		
		
		System.out.println(	st.size());//4

		st.clear();
		 System.out.println(st);
		
		
		
;		
		
		
		
		

	}

}
