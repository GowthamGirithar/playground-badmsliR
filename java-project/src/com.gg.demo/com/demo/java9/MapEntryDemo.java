package com.demo.java9;

import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * @author Gowtham Girithar Srirangasamy
 *  The code to explain the takewhile in java 9.
 */
public class DemoTakeWhile  {
	public static void main(String[] args){
		Stream.of("apple", "banana", "cat", "", "elephant","","Dog")
	.takeWhile(s->!s.isEmpty()).forEach(System.out::println);
}
}