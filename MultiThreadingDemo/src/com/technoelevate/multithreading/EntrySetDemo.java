package com.technoelevate.multithreading;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EntrySetDemo {

	public static void main(String[] args) {
		String setValue=null;
		Map<Integer,String> map=new HashMap<Integer, String>();
		for(int i=10;i<=100;i=i+10) {
			map.put(i, "demo"+i);
		}
		System.out.println(map);
		System.out.println("***********Entry Set************");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
			if(entry.getKey().equals(10)) {
				setValue= entry.setValue("DEMO");
				
			}
		}
		System.out.println("Old value :"+setValue);
		System.out.println("***************After Set value*********************");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		entrySet.forEach(i->System.out.println(i));
		List<Entry<Integer, String>> collect = entrySet.stream().filter(i->i.getKey()>50).collect(Collectors.toList());
		collect.forEach(i->System.out.println(i));
	}

}
