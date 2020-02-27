package com.athena.occurence;

import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Occurence occu=new Occurence();
		Map<String, Integer> map=occu.CountChar("saurabh raj");
		System.out.println(map);
	}

}
