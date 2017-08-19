package com.demo.java9;

import java.util.Map;
/**
 * 
 * @author Gowtham Girithar Srirangasamy
 *  The code to explain the Map.of() in java 9.
 */
public class MapOfDemo  {
	public static void main(String[] args){
		Map<Integer,String> emptyMap = Map.of();
        Map<Integer,String> map = Map.of(1, "Apple", 2, "Bat", 3, "Cat");
		
		emptyMap.forEach((k,v) -> System.out.println( k +"-"+ v));
		map.forEach((k,v) -> System.out.println( k +"-"+ v));
}
}