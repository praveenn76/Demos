package org.ey;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmapss {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new LinkedHashMap<>();
		
		m.put(10,"java");
		m.put(20, "power bi");
		m.put(30,"alteryx");
		m.put(10, "java");
		System.out.println(m);
	}
}

