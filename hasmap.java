package framework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hasmap //order not maintain  key unique
{

	public static void main(String[] args) {
		Map <String,Integer> map = new HashMap<>();
		//tree map me keycke basis pe shorting hojygi

		
		map.put("yuvraj", 2);
		map.put("zogesh", 3);
		map.put("rieshi", 3);
		map.put("soni", 1);
		
		System.out.println(map);
		
	map.put("yuvraj", 23);
	System.out.println(map);//because key are unique
	}

}
