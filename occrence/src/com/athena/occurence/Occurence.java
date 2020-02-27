package com.athena.occurence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Occurence {

	public Map CountChar(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map.put("a", 1);
		// map.put("b", 1);
		Set<String> set = new HashSet<String>();
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		// convert into char aaray

		for (int i = 0; i < len; i++) {
			// System.out.println("a");
			// if not available in map
			set = map.keySet();
			// char to string
			String currStr = "" + charArr[i];
			System.out.println("===set===" + set);
			if (map.containsKey(currStr)) {
				System.out.println("true");
				map.put(currStr, map.get(currStr) + 1);
			} else {
				map.put(currStr, 1);
			}
		}

		return map;
	}
}
