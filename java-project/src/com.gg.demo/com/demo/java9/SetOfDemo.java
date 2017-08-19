package com.demo.java9;

import java.util.Set;
/**
 * 
 * @author Gowtham Girithar Srirangasamy
 *  The code to explain the  set.of() in java 9.
 */
public class SetOfDemo  {
	public static void main(String[] args){
		
       Set<String> set1= Set.of("apple","bat");
       Set<String> set2= Set.of();
		
		System.out.println("** Set with values **");
		set1.forEach(value-> System.out.println(value));
		System.out.println("** List empty **");
		set2.forEach(value-> System.out.println(value));
}
}