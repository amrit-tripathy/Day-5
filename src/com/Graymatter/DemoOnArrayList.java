package com.Graymatter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoOnArrayList {
//its a resizable array
//arraylist initial size = 10;
//if arraylist capacity gets exhausted then its capacity increases to currentcapacity + currentcapacity/2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alist = new ArrayList();
		alist.add(45);
		alist.add("abcd");
		alist.add(45.67);
		alist.add(true);
		System.out.println(alist);//[45, abcd, 45.67, true]
		alist.add(45);//adding duplicate
		System.out.println(alist);
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));// it gets the elements in arraylist
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(56);
		list.add(76);
		for(int i:list) {
			System.out.println(i);
		}
		list.add(2, 21);
		System.out.println(list);
		
		list.addAll(1, alist);//from which index u want to insert and which array u want to insert
		System.out.println(list);
		
		list.remove(0);  // removes element stored at index 0
		System.out.println(list);
		System.out.println(list.contains("abcd"));//checks if "abcd" is present or not 
		list.clear();//clears all elements
		System.out.println(list);
		
		System.out.println(alist);
		alist.remove("abcd");//remove particular element "abcd"
		System.out.println(alist);
		
		alist.remove((Integer)45);  //explicit conversion of 45 to remove first occurence of 45
		System.out.println(alist);
		
		//new list
		list.add(45);
		list.add(34);
		list.add(67);
		System.out.println("using normal iterator");
		Iterator<Integer> itr = list.iterator(); //alist for concurrent modification
		while(itr.hasNext()) { //until next element is there run the loop
			System.out.println(itr.next());  //itr.next() gives next element
		}
		
		//
		System.out.println("using list iterator");
		ListIterator<Integer> listitr = list.listIterator();
		System.out.println("element in forward direction");
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		System.out.println("element in backward direction");
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		System.out.println(list);
		//modify the list by adding element
		while(listitr.hasNext()) {
			int i = listitr.next();
			if(i==67) {
				listitr.add(145);
			}
			
		}
		
		System.out.println(list);
		Iterator<Integer> itr1 = list.iterator(); 
		//modify the list by removing
		System.out.println("remove");
		while(itr1.hasNext()) {
			int i = itr1.next();
			if(i==67) {
				itr1.remove();
			}
		}
		System.out.println(list);
		//sort the list
		
		Collections.sort(list);
		System.out.println(list);
		
		
			
		
		
		
		
	}

}
