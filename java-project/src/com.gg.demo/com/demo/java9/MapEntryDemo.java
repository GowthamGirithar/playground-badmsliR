package com.demo.java9;

import java.util.Map.*;

/**
 * 
 * @author Gowtham Girithar Srirangasamy
 *  The code to explain the Map.Entry in java 9.
 */
public class MapEntryDemo  {
	public static void main(String[] args){
	System.out.println("** Empty  Map Entry **");
	Map<Integer,String> emptyEntry = Map.ofEntries();
	emptyEntry.forEach((k,v) -> System.out.println(k+"-"+v));
	
	System.out.println("**   Map Entry with value **");
	Map.Entry<Integer,String> mapEntry1 = Map.entry(1,"Apple");
	Map.Entry<Integer,String> mapEntry2 = Map.entry(2,"Bat");
	Map.Entry<Integer,String> mapEntry3 = Map.entry(3,"Cat");
	Map<Integer,String> mapEntry = Map.ofEntries(mapEntry1,mapEntry2,mapEntry3);

	mapEntry.forEach((k,v) -> System.out.println(k+"-"+v));
}
}
