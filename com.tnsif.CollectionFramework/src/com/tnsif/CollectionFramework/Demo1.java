package com.tnsif.CollectionFramework;

import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		
		TreeSet<Integer> al=new TreeSet<Integer>();
		al.add(9);
		al.add(8);
		al.add(9);
		al.add(6);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.remove(3));
		System.out.println(al);
}
}
