package org.sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> m=new HashMap<>();
		
		m.put(null,"Java");
		m.put(40,null);
		m.put(10,null);
		m.put(null,"selenium");
		
		
		m.put(null,"Java");
		m.put(40,null);
		m.put(10,null);
		m.put(null,"selenium");
		
		
		System.out.println(m);
		
		
		
		
//		int size = m.size();
//		System.out.println(size);
//		
//		boolean containsKey = m.containsKey(20);
//		System.out.println(containsKey);
//		
//		boolean containsKey1 = m.containsKey(70);
//		System.out.println(containsKey1);
//		
//		boolean containsValue = m.containsValue("api");
//		System.out.println(containsValue);
//		
//		boolean containsValue1 = m.containsValue("appium");
//		System.out.println(containsValue1);
//		
//		String string = m.get(30);
//		System.out.println(string);
//		
//		String string2 = m.get(90);
//		System.out.println(string2);
//		
//		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
//		
//		for (Integer integer : keySet) {
//			System.out.println(integer);
//		}
//		
//		
//		Collection<String> values = m.values();
//		System.out.println(values);
//		
//		for (String string3 : values) {
//			System.out.println(string3);
//		}
//		
//		
//		Set<Entry<Integer, String>> entrySet = m.entrySet();
//		System.out.println(entrySet);
//		
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry);
//		}
//		
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println("Key is "+entry.getKey());
//			System.out.println("Value is "+entry.getValue());
//		}
//		
		
		
		
		
		//Set 
//		
//		List<Integer> l=new LinkedList<>();
//		
//		//To insert values
//		
//		l.add(30);
//		l.add(50);
//		l.add(10);
//		l.add(20);
//		l.add(40);
//		l.add(10);
//		l.add(30);
//		
//		
//		
//		Set<Integer> s=new TreeSet<>();
//		
//		s.addAll(l);
//		System.out.println(s);
//		System.out.println(l);
//		
//		System.out.println("Count of duplicates:"+(l.size()-(s.size())));
//		
		
		
//		for (Integer integer : s) {
//			System.out.println(integer);
//		}
		
	}

}
