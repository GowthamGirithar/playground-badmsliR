package com.demo.java9;

import java.util.List;
/**
 * 
 * @author Gowtham Girithar Srirangasamy
 * The code to explain the List.of() in java 9.
 */
public class ListOfDemo  {
	public static void main(String[] args){
		
		List<String> list1=List.of("apple","bat");
		List<String> list2= List.of();
		
		System.out.println("** List with values **")
		list1.forEach(value-> System.out::println);
		System.out.println("** List empty **")
		list2.forEach(value-> System.out::println);
		
}
}