package com.technoelevate.exp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 10; i++) {
			map.put((i+1)*10, "Demo"+i);
		}
		System.out.println(map);
		System.out.println("++++++++++++++++++++Entry Interface++++++++++++++++++++++++");
		Collection<Entry<Integer, String>> entrySet = map.entrySet();
		Set<Integer> keySet = map.keySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		 
		ArrayList<Entry<Integer, String>> arrayList=new ArrayList<Map.Entry<Integer,String>>(entrySet);
		Collections.sort(arrayList,new MapSortUsingArraylist());
		System.out.println(arrayList);
		
		
		
		
		
		
		
		
		/*
		 * map.put(10, "abc"); map.put(50, "xyz"); map.put(35, "mno"); map.put(49,
		 * "pqr"); System.out.println("=============Key Set============="); Set<Integer>
		 * keys = map.keySet(); System.out.println(keys);
		 * System.out.println("=============For Collection=============");
		 * Collection<String> values = map.values(); System.out.println(values);
		 * 
		 * System.out.println(map.get(50)); System.out.println(map.put(10, "Sahid"));
		 * 
		 * System.out.println("=============Entry Set============="); Set<Entry<Integer,
		 * String>> entry = map.entrySet(); System.out.println(entry);
		 * System.out.println("=============For Each============="); for
		 * (Map.Entry<Integer, String> entry1 : entry) {
		 * System.out.println(entry1.getKey()+"    "+entry1.getValue()); }
		 */
	}
}
